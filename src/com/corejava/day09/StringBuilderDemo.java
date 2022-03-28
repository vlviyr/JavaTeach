package com.corejava.day09;

/**
 * 2022-03-24
 * 本类用来演示java.lang.StringBuilder类
 * 1. 构造方法
 *      1.1 创建一个初始容量为16的空字符串容器
 *      StringBuilder strB1 = new StringBuilder();
 *      1.2 创建一个指定容器的空字符串容器
 *      StringBuilder strB2 = new StringBuilder(8);
 *      1.3 创建指定内容的字符串容器
 *      StringBuilder strB3 = new StringBuilder("abc");
 *      注意：创建指定内容字符串容器的时候，初始字符串并未默认的16个字符空间
 *      1.4 常用方法
 *          1.拼接方法 str.append()
 *          2.获取字符数 str.length()
 *          3.获取容量 str.capacity()
 *          4.删除指定下标区间的内容，前闭后开 str.delete()
 *          5.在指定下标处添加内容 str.insert()
 *          6.替换方法 str.replace()
 *              注意：String()类的参数为（旧字符串，新字符串），StringBuilder()类的参数为下标区间。
 *          7.设置字符 setCharAt()
 *          8.反转字符串 reverse()
 *
 *
 *
 *
 */

public class StringBuilderDemo {
    public static void main(String[] args){
        StringBuilder strB1 = new StringBuilder();
        System.out.println(strB1.length());
        System.out.println(strB1.capacity());
        System.out.println("----------------------------");

        StringBuilder strB2 = new StringBuilder(8);
        System.out.println(strB2.capacity());
        System.out.println("----------------------------");

        StringBuilder strB3 = new StringBuilder("abc");
        System.out.println(strB3.length());
        System.out.println(strB3.capacity());
        System.out.println("----------------------------");

        System.out.println("原始字符串：" + strB3);
        strB3.append("123DEF");
        System.out.println("append方法：" + strB3);
        strB3.delete(3, 6);
        System.out.println("delete:" + strB3);
        strB3.insert(3, "123");
        System.out.println("insert:" + strB3);
        strB3.replace(3, 6, "456");
        System.out.println("replace:" + strB3);
        strB3.reverse();
        System.out.println("reverse:" + strB3);







    }
}
