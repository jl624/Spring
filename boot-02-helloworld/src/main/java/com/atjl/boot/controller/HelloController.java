package com.atjl.boot.controller;

import com.atjl.boot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: boot-02-helloworld
 * @description:
 * @author: JINLEI
 * @data: 2021/3/7
 * @time: 16:33
 */
@RestController
public class HelloController {

    @Autowired
    Person person;

    @RequestMapping("/person")
    public Person person(){
        return person;
    }
}
