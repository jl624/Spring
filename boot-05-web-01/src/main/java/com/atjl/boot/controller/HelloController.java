package com.atjl.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: boot-05-web-01
 * @description:
 * @author: JINLEI
 * @data: 2021/3/8
 * @time: 10:39
 */
@RestController
public class HelloController {

    @RequestMapping("/2.jpg")
    public String hello(){
        return "aaaa";
    }
}
