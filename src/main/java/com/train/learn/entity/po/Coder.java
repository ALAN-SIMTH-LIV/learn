package com.train.learn.entity.po;

import lombok.Builder;
import lombok.ToString;

/**
 * 使用Builder实现链式调用
 */
@Builder
@ToString
public class Coder {
    private Integer id;
    private String name;
    private Integer age;
}
