package com.corejava.day06.polymorphismdemov2;

import org.junit.Test;

/**
 * 本类为子类Son，用来演示多态的使用
 */

public class Son extends Father{
    int x = 3;
    static  int y = 4;

    public Son() {
        super();
    }


    @Override
    public void work(){
        System.out.println("儿子在工作。");
    }

    public void eat(){
        System.out.println("儿子在吃。");
    }
}
