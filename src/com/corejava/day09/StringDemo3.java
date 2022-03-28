package com.corejava.day09;

/**
 * 2022-03-24
 * 本类用来演示java字符串拼接原理
 *
 * 由于String类是不变类，所以一旦定义无法改变；在一个字符串的基础上拼接字符串相当于创建了一个新字符串，
 * 此时内存中有两个字符串对象，即用传统方法拼接字符串对象会产冗余的垃圾对象，所以字符串拼接性能较差。
 *
 * 如何解决？
 * 使用动态字符串类java.lang.StringBuilder/StringBuffer
 *
 * 注意：
 * java.lang.StringBuilder和java.lang.StringBuffer两个类在功能上是完全一样的，
 * 区别在于StringBuilder是轻量级线程，非安全的；StringBuffer
 * 注意：
 * JDK5.0 之后对+进行了重写，即+拼接性能和StringBuilder的append方法基本相等，
 * 所以，单用可以用+拼接，但是在循环中必须使用StringBuilder来提升性能。
 *
 */

public class StringDemo3 {
    public static void main(String[] args){
        String r1 = "abc" + "def";
        String r2 = new StringBuilder("abc").append("def").toString();
        System.out.println("r1:" + r1);
        System.out.println("r2:" + r2);

        stringAdd();
        stringBuilderAdd();

    }

    private static void stringAdd(){
        long start = System.currentTimeMillis();
        String str = "abc";
        for(int i = 0; i < 100000; i++){
            str += "def";
        }
        long end = System.currentTimeMillis();
        System.out.println("string类循环耗时：" + (end-start));
    }

    private static void stringBuilderAdd(){
        long start  = System.currentTimeMillis();
        StringBuilder strB = new StringBuilder("abc");
        for(int i= 0; i < 100000; i++){
            strB.append("def");
        }
        long end = System.currentTimeMillis();
        System.out.println("stringBuilder类循环耗时：" + (end-start));
    }
}
