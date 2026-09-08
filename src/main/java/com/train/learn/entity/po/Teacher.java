package com.train.learn.entity.po;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 使用Accessors实现链式调用
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString
public class Teacher {
    private Integer id;
    private String name;
    private Integer age;
}
