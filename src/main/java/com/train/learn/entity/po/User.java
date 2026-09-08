package com.train.learn.entity.po;

import lombok.Getter;
import lombok.ToString;

/**
 * 原生实现，链式调用
 */
@Getter
@ToString
public class User {
    private Integer id;
    private String name;
    private Integer age;

    public User id(Integer id){
        this.id = id;
        return this;
    }

    public User name(String name){
        this.name = name;
        return this;
    }

    public User age(Integer age){
        this.age = age;
        return this;
    }
}
