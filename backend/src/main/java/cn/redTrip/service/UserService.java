package cn.redTrip.service;

import cn.redTrip.entity.CommonResult;
import cn.redTrip.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 29622
* @description 针对表【user】的数据库操作Service
* @createDate 2024-02-02 16:12:39
*/
public interface UserService extends IService<User> {

    CommonResult register(User user);

    CommonResult getUserInfo();
}
