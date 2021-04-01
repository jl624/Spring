package com.jl.boot.controller;

import com.jl.boot.bean.Car;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: boot-01-helloworld
 * @description:
 * @author: JINLEI
 * @data: 2021/3/3
 * @time: 10:00
 */

//@ResponseBody
//@Controller
@Slf4j
@RestController
public class HelloController {


    @RequestMapping("/hello2")
    public String handle01(){
        log.info("请求进入");
        return "Hello,Spring Boot！";
    }

    @Autowired
    Car car;

    @RequestMapping("/car")
    public Car car(){

        return car;
    }


}
