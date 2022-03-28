package com.corejava.day06.finaldemo;

import org.junit.Test;

public class TestFinalDemo {

    @Test
    //测试修饰局部变量
    public void testFinal1(){
        //修饰局部变量
        final int a;
        a = 3;
        //a = 4; 报错，无法进行第二次赋值

        final int b = 2;
        //b = 1; 报错，无法进行第二次赋值
        System.out.println("a=" + a + "\nb=" + b);
    }

    @Test
    //测试修饰属性
    public void testFinal2(){
        System.out.println(FinalDemo.PI);
        FinalDemo.c = 3;
        //FinalDemo.PI = 4; 报错，未用final修饰可以重新赋值，使用final修饰则无法重新赋值
    }

    @Test
    public void testFinal3(){
        class Fin extends FinalDemo{
/*            @Override
            public void test(){
                System.out.println("子类方法");
            }*/ //报错，无法对父类中用final修饰的方法重写
        }

        Fin fin = new Fin();
        fin.test();
    }
}
