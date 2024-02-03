package cn.redTrip.service.impl;

import cn.dev33.satoken.stp.SaTokenInfo;
import cn.dev33.satoken.stp.StpUtil;
import cn.redTrip.common.UserLocalThread;
import cn.redTrip.entity.CommonResult;
import cn.redTrip.entity.EnumObject;
import cn.redTrip.entity.dto.UserVo;
import cn.redTrip.exception.NullException;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.redTrip.entity.User;
import cn.redTrip.service.UserService;
import cn.redTrip.mapper.UserMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
* @author 29622
* @description 针对表【user】的数据库操作Service实现
* @createDate 2024-02-02 16:12:39
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

    @Resource
    private UserService userService;

    @Value("${CustomCache.preFix}")
    private String prefix;

    @Value("${CustomCache.expireTime}")
    private Integer expireTime;
    @Resource
    private RedisTemplate<String,Object> redisTemplate;

    @Override
    public CommonResult register(User user) {
        try {
            userService.save(user);
            StpUtil.login(user.getUserId());
            SaTokenInfo tokenInfo = StpUtil.getTokenInfo();
            return CommonResult.success(tokenInfo);

        }catch (NullPointerException e){
            throw new NullException("注册失败");
        }


    }

    /*
     * @author dzl
     * @description 做redis缓存，redis查出来为空的时候就从数据库查
     * @date 2024/2/3 21:00
     * @param
     * @return
     */

    @Override
    public CommonResult getUserInfo() {
        Integer userId = UserLocalThread.getThreadLocal();
        Object o = redisTemplate.opsForValue().get(prefix+userId.toString());
        if (ObjectUtils.isEmpty(o)){
            LambdaQueryWrapper<User> userLambdaQueryWrapper = new LambdaQueryWrapper<>();
            userLambdaQueryWrapper.eq(User::getUserId,userId);
            UserVo userVo = new UserVo();
            BeanUtils.copyProperties(userService.getOne(userLambdaQueryWrapper),userVo);
            redisTemplate.opsForValue().set(prefix+userId.toString(),userVo,expireTime, TimeUnit.SECONDS);
            return CommonResult.success(userVo);
        }

        return CommonResult.success(o);


    }

    @Override
    public CommonResult login(User user) {
        LambdaQueryWrapper<User> userLambdaQueryWrapper = new LambdaQueryWrapper<>();
        userLambdaQueryWrapper.eq(User::getNumber,user.getNumber()).eq(User::getPassword,user.getPassword());
        User one = userService.getOne(userLambdaQueryWrapper);
        if (ObjectUtils.isEmpty(one)){
            return CommonResult.fail("用户名或密码错误", EnumObject.PASSWORD_ERROR);
        }else{

            StpUtil.login(one.getUserId());
            SaTokenInfo tokenInfo = StpUtil.getTokenInfo();
            UserVo userVo = new UserVo();
            BeanUtils.copyProperties(one,userVo);
            redisTemplate.opsForValue().set(prefix+one.getUserId().toString(),userVo,expireTime, TimeUnit.SECONDS);
            return CommonResult.success(tokenInfo);

        }


    }
}




