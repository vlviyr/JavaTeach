package com.corejava.day06.polymorphismdemo;

/**
 * 2022/02/17
 * 本类为所有形状的父类，用来演示多态
 *
 * 多态的体现：
 * 1、方法参数列表写成父类
 * 2、方法的返回类型写成父类
 * 3、对象的数据类型写成父类
 */

public abstract class Shape {

    //以下两个方法在参数列表为多态的情况下要存在，因为子类需要重写这两个方法
    public double length(double len, double wide){
        return 0.0;
    }

    public double area(double len, double wide){
        return 0.0;
    }

    public abstract double length();

    public abstract double area();

}
