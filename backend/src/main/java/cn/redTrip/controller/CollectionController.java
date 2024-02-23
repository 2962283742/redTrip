package cn.redTrip.controller;

import cn.redTrip.entity.Collection;
import cn.redTrip.entity.CommonResult;
import cn.redTrip.service.CollectionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author dzl
 * @date 2024/2/17 20:28
 */
@RestController
@RequestMapping("/collection")
public class CollectionController {

    @Resource
    private CollectionService collectionService;


    @PostMapping("/add")
    public CommonResult addCollection(@RequestBody Collection collection){
        return collectionService.addCollection(collection);

    }
    @GetMapping("/list")
    public CommonResult queryCollection(){
        return collectionService.queryCollection();
    }

    @PostMapping("/delete")
    public CommonResult deleteCollection(@RequestParam("articleId") Integer articleId){
        return collectionService.deleteCollection(articleId);
    }

}
