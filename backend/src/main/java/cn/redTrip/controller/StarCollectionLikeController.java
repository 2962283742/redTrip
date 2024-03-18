package cn.redTrip.controller;

import cn.redTrip.common.UserLocalThread;
import cn.redTrip.entity.CommonResult;
import cn.redTrip.mapper.CommonArticleMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author dzl
 * @date 2024/3/13 8:51
 */

@RestController
@RequestMapping("/other")
public class StarCollectionLikeController {

    @Resource
    private CommonArticleMapper commonArticleMapper;

    @GetMapping("/query")
    public CommonResult query(@RequestParam("articleId") Integer articleId){
        return CommonResult.success(commonArticleMapper.queryUserAndArticle(UserLocalThread.getThreadLocal(),articleId));
    }


}
