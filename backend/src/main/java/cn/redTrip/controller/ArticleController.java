package cn.redTrip.controller;

import cn.redTrip.entity.CommonArticle;
import cn.redTrip.entity.CommonResult;
import cn.redTrip.service.CommonArticleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author dzl
 * @date 2024/2/5 18:49
 */
@RestController
@RequestMapping("/article")

public class ArticleController {

    @Resource
    private CommonArticleService commonArticleService;



    @GetMapping("/detail")
    public CommonResult queryDetail(@RequestParam("id") Integer id){
        return commonArticleService.queryDetail(id);
    }

    @GetMapping("/list")
    public CommonResult queryList(@RequestParam("type") Integer type){
        return commonArticleService.queryList(type);
    }

    @PostMapping("/search")
    public CommonResult searchArticle(@RequestParam("keyword") String keyword){
        return commonArticleService.searchArticle(keyword);
    }


}
