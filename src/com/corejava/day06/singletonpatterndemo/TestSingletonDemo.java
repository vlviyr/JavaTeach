package com.corejava.day06.singletonpatterndemo;

import org.junit.Test;

public class TestSingletonDemo {

    @Test
    //测试SingletonDemo
    public void testSingletonDemo(){
        SingletonDemo sd1 = new SingletonDemo();
        SingletonDemo sd2 = new SingletonDemo();

        if(sd1 == sd2){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }

    @Test
    //测试SingletonDemo1（饿汉模式）
    public void testSingletonDemo1(){
        SingletonDemo1 sd1 = SingletonDemo1.getInstance();
        SingletonDemo1 sd2 = SingletonDemo1.getInstance();

        if(sd1 == sd2){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

    }

    @Test
    //测试SingletonDemo2（懒汉模式）
    public void testSingletonDemo2(){
        SingletonDemo2 sd1 = SingletonDemo2.getInstance();
        SingletonDemo2 sd2 = SingletonDemo2.getInstance();

        if(sd1 == sd2){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }





}
