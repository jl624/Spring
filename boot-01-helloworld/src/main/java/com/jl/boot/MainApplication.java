package com.jl.boot;

import com.jl.boot.bean.Pet;
import com.jl.boot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


/**
 * @program: boot-01-helloworld
 * @description:Spring boot应用
 * @author: JINLEI
 * @data: 2021/3/3
 * @time: 9:54
 */

/**
 * 主程序类
 * @SpringBootApplication： 这个一个Spring boot应用
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {

        //SpringApplication.run(MainApplication.class,args);

        //1、返回IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class,args);

        //2、 查看容器的组件
        String[] names = run.getBeanDefinitionNames();
        for (String name : names){
            System.out.println(name);
        }

        //3、从容器中获取组件
        Pet tom01 = run.getBean("tom",Pet.class);
        Pet tom02 = run.getBean("tom",Pet.class);
        System.out.println("组件："+(tom01 == tom02));

        MyConfig bean = run.getBean(MyConfig.class);
        System.out.println(bean);
   }
}
