package cn.redTrip.controller;

import cn.redTrip.entity.CommonResult;
import cn.redTrip.entity.User;
import cn.redTrip.entity.dto.UserRegister;
import cn.redTrip.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author dzl
 * @date 2024/2/2 16:10
 */
@RestController
@RequestMapping("/user")
public class UserMangerController {

    @Resource
    private UserService userService;

    @PostMapping("/login")
    public CommonResult login(){
       return CommonResult.success(userService.list().toString());
    }


    @PostMapping("/register")
    public CommonResult register(@RequestBody User user){
        return userService.register(user);
    }

}
