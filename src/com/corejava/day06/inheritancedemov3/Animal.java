package com.corejava.day06.inheritancedemov3;

/**
 * 2022/02/16
 * 本类用来演示java类的构造函数调用以及函数重写
 *
 * 1、构造函数super
 * 2、调用父类构造函数Animal
 * 3、存在重写，使用子类getDesc-->desc = "Worf=null和Weight=0.0"
 * 4、特有属性构造-->this.name = name; this.weigth = weight;
 * 5、子类打印对象--调用父类toString函数，返回desc的值
 */
public class Animal {
    private String desc;

    public Animal(){
        this.desc = getDesc();
    }

    public String getDesc(){
        return "Animal";
    }

    public String toString(){
        return desc;
    }
}
