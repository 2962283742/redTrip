package cn.redTrip.controller;

import cn.redTrip.entity.CommonResult;
import cn.redTrip.service.LikeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author dzl
 * @date 2024/2/17 21:19
 */
@RestController
@RequestMapping("/like")
public class LikeController {

    @Resource
    private LikeService likeService;

    @PostMapping("/add")
    public CommonResult addLike(@RequestParam("articleId") Integer articleId){
        return likeService.addLike(articleId);
    }

    @GetMapping("/query")
    public CommonResult queryLike(){
        return likeService.queryLike();
    }


    @PostMapping("/delete")
    public CommonResult deleteLike(@RequestParam("articleId") Integer articleId){
        return likeService.deleteLike(articleId);
    }
}
