package cn.redTrip.controller;

import cn.redTrip.entity.CommonResult;
import cn.redTrip.service.CommonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author dzl
 * @date 2024/2/19 18:12
 */
@RestController
@RequestMapping("/common")
public class CommonController {

    @Resource
    private CommonService commonService;



    @GetMapping("/swiper")
    public CommonResult querySwiper(@RequestParam("avatarType") Integer avatarType){
        return commonService.queryAvatar(avatarType);
    }



}
