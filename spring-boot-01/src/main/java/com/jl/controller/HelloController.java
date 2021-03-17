package com.jl.controller;

import org.springframework.stereotype.Controller;

/**
 * @author jinlei
 * @data 2020/11/1 - 20:45
 */

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){

        return "Hello World!";
    }
}
