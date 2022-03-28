package com.corejava.day09;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

/**
 * 2022-03-22
 * 本类用来演示java.lang.String类
 * 注意：String类是用final修饰的类，所以无法被重写（改变规则）
 *
 * 1.创建字符串
 * 1.1基本创建方法（一般不用）
 * 原理：每次创建字符串都开辟出一块新的内存空间用于存放字符串。
 * 1.2串池创建（推荐使用）
 * 原理：第一次创建字符串时，会分配内存空间存放字符串对象，然后就把这个对象放入到串池中（内存区域），
 *      第二次创建字符串时，会先把它的值和串池中的对象值进行比较，如果值市相同的，则直接把串池中的对象的
 *      内存地址复制给新对象，否则new出一个全新的对象。
 * 2.构造方法创建字符串
 * 2.1 String/StringBuilder/StringBuffer参数
 * 2.2 字符数组
 * 2.3 字节数组
 *     a.使用字节数组可以通过【字符串硬编码】方式来实现字符串乱码的正确显示
 *     b.如果传入非法字符集，则出现异常java.io.UnsupportedEncodingException
 *     c.中文字符集：UTF-8，GBK；英文字符集：ISO-8859-1
 *
 *
 */
public class StringDemo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //1.1 基本创建方法
        String str1 = new String("字符串");
        String str2 = new String("字符串");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println("-------------------------");


        //1.2 串池创建方法
        String str3 = "字符串";
        String str4 = "字符串";
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));
        System.out.println("-------------------------");

        //2.2 字符数组
         char[] chars = {'A', 'B', 'C', 'D'};
         String str5 = new String(chars);
         String str6 = new String(chars, 1, 3);
         System.out.println(str5);
         System.out.println(str6);
         System.out.println("---------------------------------");
         //2.3 字节数组

        String str7 = new String("æ\u0088\u0091å\u009C¨å\u00AD¦ä¹ javaç¼\u0096ç¨\u008B".getBytes("ISO-8859-1"), "UTF-8");
    }
}
