package com.atjl.boot.bean;

import lombok.Data;
import lombok.ToString;

/**
 * @program: boot-02-helloworld
 * @description:
 * @author: JINLEI
 * @data: 2021/3/7
 * @time: 15:59
 */
@ToString
@Data
public class Pet {
    private String name;
    private Double weight;
}
