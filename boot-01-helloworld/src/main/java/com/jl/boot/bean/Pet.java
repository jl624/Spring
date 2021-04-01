package com.jl.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @program: boot-01-helloworld
 * @description:
 *              宠物
 * @author: JINLEI
 * @data: 2021/3/4
 * @time: 15:35
 */
@ToString
@Data
@NoArgsConstructor//无参构造器
@AllArgsConstructor//全参构造器
public class Pet {
    private String name;

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }
}
