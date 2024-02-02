package cn.redTrip.service.impl;

import cn.dev33.satoken.stp.SaTokenInfo;
import cn.dev33.satoken.stp.StpUtil;
import cn.redTrip.entity.CommonResult;
import cn.redTrip.entity.dto.UserRegister;
import cn.redTrip.exception.NullException;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.redTrip.entity.User;
import cn.redTrip.service.UserService;
import cn.redTrip.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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
}




