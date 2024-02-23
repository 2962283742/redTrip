package cn.redTrip.controller;

import cn.redTrip.entity.CommonResult;
import cn.redTrip.service.ReviewService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author dzl
 * @date 2024/2/19 15:42
 */
@RestController
@RequestMapping("/review")
public class ReviewController {

    @Resource
    private ReviewService reviewService;


    @PostMapping("/add")
    public CommonResult reviewAdd(@RequestParam("articleId") Integer articleId,@RequestParam("content") String content){
        return reviewService.addReview(articleId,content);
    }

    @GetMapping("/query")
    public CommonResult queryReview(@RequestParam("articleId") Integer articleId){
        return reviewService.queryReview(articleId);
    }

    @PostMapping("/star")
    public CommonResult starReview(@RequestParam("reviewId") Integer reviewId){
        return reviewService.starReview(reviewId);
    }
}
