package cn.redTrip.service;

import cn.redTrip.entity.Common;
import cn.redTrip.entity.CommonResult;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 29622
* @description 针对表【common】的数据库操作Service
* @createDate 2024-02-19 20:05:49
*/
public interface CommonService extends IService<Common> {

    CommonResult queryAvatar(Integer avatarType);
}
