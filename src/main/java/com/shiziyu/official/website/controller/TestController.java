package com.shiziyu.official.website.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: project
 * @description: 测试Controller
 * @author: zhouyuj
 * @create: 2021-12-06 16:35
 **/
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "test success";
    }
}
