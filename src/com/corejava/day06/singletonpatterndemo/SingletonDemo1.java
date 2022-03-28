package com.corejava.day06.singletonpatterndemo;

/**
 * 2022/02/17
 * 本类用来演示Java的23中设计模式之一单例模式（饿汉模式）
 *
 * 饿汉模式（只适用于单线程）：
 * 在类调用的时候有且仅创建一次实例
 */

public class SingletonDemo1 {
    private static final SingletonDemo1 sd = new SingletonDemo1();

    private SingletonDemo1(){
    }

    public static SingletonDemo1 getInstance(){
        return sd;
    }
}
