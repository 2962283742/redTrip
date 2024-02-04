package cn.redTrip.controller;

import cn.redTrip.entity.CommonResult;
import cn.redTrip.service.QuestionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author dzl
 * @date 2024/2/4 20:25
 */
@RestController
@RequestMapping("/question")
public class QuestionController {

    @Resource
    private QuestionService questionService;

    @GetMapping("/{type}")
    public CommonResult getQuestions(@PathVariable Integer type){
        return questionService.getQuestions(type);
    }


    @PostMapping("/judge")
    public CommonResult justiceOption(@RequestParam("questionId") Integer questionId,@RequestParam("option") String option){
        return questionService.justiceOption(questionId,option);
    }


}
