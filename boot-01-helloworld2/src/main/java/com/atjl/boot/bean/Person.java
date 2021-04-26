package com.atjl.boot.bean;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @program: boot-01-helloworld2
 * @description:
 * @author: JINLEI
 * @data: 2021/3/7
 * @time: 15:01
 */


public class Person {

    private String userName;
    private Boolean boss;
    private Integer age;
    private Date birth;
    private Pet pet;
    private String[] interesets;
    private List<String> animal;
    private Map<String, Object> score;
    private Set<Double> salarys;
    private Map<String, List<Pet>> allPets;
}
