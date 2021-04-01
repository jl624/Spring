package com.jl.boot.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @program: boot-01-helloworld
 * @description:
 * @author: JINLEI
 * @data: 2021/3/4
 * @time: 19:18
 */
//只有在容器中的组件，才会有SpringBoot提供的功能
@ToString
@Data
@Component
@ConfigurationProperties(prefix = "mycar")
public class Car {
    private String brand;
    private Integer price;

}
