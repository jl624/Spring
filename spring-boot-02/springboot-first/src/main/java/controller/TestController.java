package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jinlei
 * @data 2020/11/3 - 22:01
 */

@RestController
public class TestController {

    @RequestMapping("hello")
    public String hello(){

        return "Hello Spring-boot";
    }
}
