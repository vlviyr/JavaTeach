package com.corejava.day05.staticdemo;

import com.corejava.day05.staticdemo.StaticDemo;

public class TestStaticDemo {
    public static void main(String[] args){
        StaticDemo sd1 = new StaticDemo();
        StaticDemo sd2 = new StaticDemo();

        System.out.println(sd1.getNum());
        System.out.println(sd2.getNum());
    }
}
