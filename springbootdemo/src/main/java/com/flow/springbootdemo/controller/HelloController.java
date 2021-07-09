package com.flow.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: liudongjie
 * @Date: 2019-11-05 19:41
 * @Description:
 */

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/")
    public String index(){
        return "Hello world";
    }
}
