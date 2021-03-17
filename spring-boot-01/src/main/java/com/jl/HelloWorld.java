package com.jl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author jinlei
 * @data 2020/11/1 - 20:10
 */
/*
@SpringBootApplication  来标注一个主程序类，说明这是一个Spring boot 应用
 */
@SpringBootApplication
public class HelloWorld {

    public static void main(String[] args) {

        //Spring应用启动
        SpringApplication.run(HelloWorld.class,args);
    }
}
