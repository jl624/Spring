package com.jl.boot.config;

import com.jl.boot.bean.Pet;
import com.jl.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: boot-01-helloworld
 * @description:
 *              配置文件
 * @author: JINLEI
 * @data: 2021/3/4
 * @time: 15:57
 */

/**
 * 1、配置类里面使用@Bean标注在方法上给容器注册组件，默认是单实例
 * 2、配置类本身也是组件
 * 3、proxyBeanMethods:代理bean的方法
 */
@Configuration(proxyBeanMethods = true)//告诉SpringBoot这是配置类 == 配置文件
public class MyConfig {

    /**
     * 给容器中添加组件，以方法名为组件的id，返回值类型就是组件类型。
     * 返回的值，就是组件在容器中的实例
     * 外部无论对配置类中的这个组件注册方法调用多少次获取的都是之前注册容器中的单实例
     */
    @Bean
    public User user01(){
        return new User("zhangsan",18);
    }

    @Bean("tom")
    public Pet tomcatPet(){
        return new Pet("tomcat");
    }
}
