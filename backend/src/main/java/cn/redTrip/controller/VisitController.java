package cn.redTrip.controller;

import cn.redTrip.common.RedisCacheForVisit;
import cn.redTrip.entity.CommonResult;
import cn.redTrip.service.VisitService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author dzl
 * @date 2024/2/19 14:57
 */
@RestController
@RequestMapping("/visit")
public class VisitController {

    @Resource
    private RedisCacheForVisit redisCacheForVisit;

    @Resource
    private VisitService visitService;


    @GetMapping("/query")
    public CommonResult queryVisit(){
        return visitService.queryVisit();
    }

    @PostMapping("/add")
    public CommonResult addVisit(@RequestParam("articleId") Integer articleId){
        return visitService.addVisit(articleId);

    }

}
