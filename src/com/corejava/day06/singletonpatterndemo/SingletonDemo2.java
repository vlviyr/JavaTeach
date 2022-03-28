package com.corejava.day06.singletonpatterndemo;

/**
 * 2022/02/17
 * 本类用来演示23种设计模式中的单例模式（懒汉模式）
 * 懒汉模式（只适用于单线程）：
 * 在第一次创建实例的时候，创建唯一的实例
 */
public class SingletonDemo2 {
    private static SingletonDemo2 sd = null;

    private SingletonDemo2(){
    }

    public static SingletonDemo2 getInstance(){
        if(sd == null){
            sd = new SingletonDemo2();
        }
        return sd;
    }
}
