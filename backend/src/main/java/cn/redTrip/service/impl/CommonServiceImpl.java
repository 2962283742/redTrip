package cn.redTrip.service.impl;

import cn.redTrip.entity.CommonResult;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.redTrip.entity.Common;
import cn.redTrip.service.CommonService;
import cn.redTrip.mapper.CommonMapper;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @author 29622
* @description 针对表【common】的数据库操作Service实现
* @createDate 2024-02-19 20:05:49
*/
@Service
public class CommonServiceImpl extends ServiceImpl<CommonMapper, Common>
    implements CommonService{

    @Resource
    private CommonService commonService;


    @Resource
    private RedisTemplate<String,Common> redisTemplate;

    @Override
    public CommonResult queryAvatar(Integer avatarType) {

        return null;
    }
}




