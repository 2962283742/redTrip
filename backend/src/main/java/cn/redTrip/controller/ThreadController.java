package cn.redTrip.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dzl
 * @date 2024/3/1 17:43
 */
@RestController
@RequestMapping("/thread-count")
public class ThreadController {
    @GetMapping()
    public int getThreadCount(){
        return Thread.activeCount();
    }
}
