package com.jl.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jinlei
 * @data 2020/11/11 - 19:46
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello quick Spring boot!";
    }
}
