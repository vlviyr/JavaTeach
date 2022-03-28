package com.corejava.day06.inheritancedemov4;

/**
 * 2022/02/16
 * 本类用来演示java类的构造函数细节以及函数重写
 * 1、调用构造函数Sub()
 * 2、调用父类构造函数Super()
 *    print()方法存在重写，调用子类中重写的print()方法--输出j
 *    i = 20;
 * 3、print(); 子类中存在j = 30，使用重写方法输出j = 30
 * 4、j = 40;
 * 5、main()函数输出j = 40;
 *
 */
public class Super {
    int i = 10;

    public Super(){
        print();
        i = 20;
    }

    public void print(){
        System.out.println(i);
    }

}
