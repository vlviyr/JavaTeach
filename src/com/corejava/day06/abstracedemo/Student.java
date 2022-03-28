package com.corejava.day06.abstracedemo;

import lombok.Data;

/**
 * 2022/02/18
 * 本类为学生实体类，用来演示抽象类的使用
 */

@Data
public class Student {
    private long id;
    private String name;
    private int age;
}
