package com.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xushuai5
 * @Description
 * @Date 创建于 2024/3/15 14:40
 */
@RestController
public class TestController {

    @GetMapping("/hello")
    public String testReturn(@RequestParam("id") Integer id) {
        return "the input id is" + id;
    }
}
