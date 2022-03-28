package com.corejava.day05.staticdemo;

/**
 * 2022/02/14
 * 本程序用来演示static关键字
 *
 * 1、静态方法
 *
 * 2、静态属性
 * 特征：类加载时只执行一次，执行的时机是在类加载过后
 * 注意：一切静态属性、静态方法的初始化时机都是早于普通属性和普通方法
 * 类加载->初始化静态成员（一次）->初始化普通成员（多次，根据调用构造方法）
 *
 * 3、静态代码块--类加载后优先执行，并且只执行一次
 * 用处：一般用于执行前置操作，例如：建立数据库链接，加载大型资源配置文件，初始化常量，权限认证
 *
 * 4、静态导入
 */

public class StaticDemo {

    private int id;//每次创建对象时，都会对成员变量进行赋值
    private static int num = 1;

    public StaticDemo(){
        this.id = num++;
    }

    public int getNum(){
        return id;
    }

    public void setNum(int id) {
        this.id = id;
    }
}
