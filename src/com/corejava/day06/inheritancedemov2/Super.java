package com.corejava.day06.inheritancedemov2;

/**
 * 2022/02/16
 * 本类用来演示继承的细节要点
 */

public class Super {

    public Super(){
        System.out.println("父类构造函数");
    }

    public void method(){
        System.out.println("父类方法");
    }

    public void show(){
        method();
    }
}
