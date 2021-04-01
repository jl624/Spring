package com.jl.boot.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @program: boot-01-helloworld
 * @description:
 *              用户
 * @author: JINLEI
 * @data: 2021/3/4
 * @time: 15:35
 */

@NoArgsConstructor
@Data
@ToString
@EqualsAndHashCode
public class User {
    private String name;
    private Integer age;

    private  Pet pet;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
