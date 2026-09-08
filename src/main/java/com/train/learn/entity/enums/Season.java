package com.train.learn.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 季节枚举类
 */
@Getter // get方法
@NoArgsConstructor // 无参构造方法
@AllArgsConstructor // 有参构造方法，不用额外处理的情况
public enum Season {
    SPRING("春天","万物复苏"), // public static final SPRING
    SUMMER("夏天","炎炎夏日"), // public static final SUMMER
    AUTUMN("秋天","不知道"), // public static final AUTUMN
    WINTER("冬天", "寒风凛冽"); // public static final WINTER

    private String name; // 名字
    private String desc; // 描述

    public static Season getByName(String name){
        for (Season item : Season.values()){
            if (item.getName().equals(name)){
                return item;
            }
        }
        return null;
    }

}
