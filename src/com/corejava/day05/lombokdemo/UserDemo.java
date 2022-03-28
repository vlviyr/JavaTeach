package com.corejava.day05.lombokdemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 本类用来演示Java添加第三方Jar包来增强功能
 *
 * 此处添加的Jar包来自于Lombok组件
 * 该组件的作用是自动生成构造函数、get/set、hashCode、equels、toString...
 *
 * 使用方式：
 * 1、在项目中添加jar包
 * 2、右击jar包，选择Build Path-->Add to build Path
 */

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserDemo {
    private String name;
    private String phone;
    private int age;
}
