package com.corejava.day06.polymorphismdemov2;

/**
 * 2022/02/17
 * 本类为父类Father，用来演示多态的用法
 */

public class Father {
    int x = 1;
    static int y = 2;


    public Father(){
    }

    public static void smoke(){
        System.out.println("爸爸正在吸烟。");
    }

    public void work(){
        System.out.println("爸爸正在工作。");
    }
}
