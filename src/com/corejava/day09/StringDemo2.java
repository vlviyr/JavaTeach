package com.corejava.day09;

import java.util.Arrays;
import java.util.Locale;

/**
 * 2022-03-23
 * 本类用来演示java.lang.String类的常用方法
 * 1. 根据下标获取字符串指定位置字符str.charAt(idx)
 *      注意：a.字符串下标从0开始，到字符串.length()-1结束
 *          b.如果传入非法下标(没有负下标），则抛出字符串下标越界异常：java.lang.StringIndexOutOfBoundsException
 * 2. 字符串比较方法
 *      str.compareTo()，按照来ascii表的顺序来比较，结果以正零负来区分大于、等于、和相等
 *      str.equals() ，精确匹配两个字符串是否完全一样
 *      str.equalsIgnoreCase()，比较的时候忽略字符串的大小写
 *      str.matches()，模糊匹配，通过正则表达式进行匹配
 * 3. 字符串拼接
 *      str.concat()
 *
 *
 * tip：
 *      a.对象在转换为字符串的时候调用类的toString()方法。
 *      b.整型、浮点型在和字符串相加的时候可以得到字符串
 *      int num = 5;
 *      String str = 5 + "";
 *
 */

public class StringDemo2 {
    public static void main(String[] args){
        //1.获取指定位置的字符
        char a = "abc".charAt(1);
        System.out.println(a);

        //2.字符串比较
        int r1 = "3".compareTo("2");
        System.out.println(r1);
        boolean r2 = "abc".equals("abc");
        System.out.println(r2);
        boolean r3 = "abc".equalsIgnoreCase("ABc");
        System.out.println(r3);
        boolean r4 = "adisl".matches("[a-z]+");
        boolean r5 = "s89fgd".matches("[a-z0-9]+");
        System.out.println(r4);
        System.out.println(r5);

        //3.字符串的拼接
        String str1 = "abc".concat("def");
        System.out.println(str1);

        //4.字符串的包含，判断字符串中是否包含指定内容
        boolean r6 = "abcded".contains("bc");
        System.out.println(r6);

        //5.判断字符串是否以指定内容开头或者结尾
        boolean r7 = "我的java编程".startsWith("我的");
        boolean r8 = "我的java编程".endsWith("编程");
        System.out.println("7:" + r7);
        System.out.println("8:" + r8);
        //6.获取某个内容在字符串第一次或者最后一次出现的下标
        System.out.println("indexOf-1:" + "1234567891".indexOf("1"));
        System.out.println("indexOf-2:" + "1234567891".indexOf("1", 5));
        System.out.println("indexOf-3:" + "1234567891".lastIndexOf("1"));
        System.out.println("indexOf-4:" + "1234567891".lastIndexOf("1", 5));


        //7.判断字符串是否为空，此方法JDK11才可以使用
        System.out.println("isBlank:" + "  ".isBlank());
        System.out.println("isBlank:" + "".isBlank());
        //JDK11前对字符串为空的判断

        System.out.println();

        //8.判断字符串长度是否为0
        System.out.println("isEmpty-1:" + "  ".isEmpty());
        System.out.println("isEmpty-2:" + "".isEmpty());

        //9.获取字符串的长度
        System.out.println("length:" + "123456".length());

        //10.字符串重复（JDK11）
        System.out.println("repeat:" + "123".repeat(3));

        //11.字符串的切割
        String[] strArr = "192.168.1.1".split("\\.");
        System.out.println("split:" + Arrays.toString(strArr));

        //12.字符串截取
        System.out.println("12345678".substring(3));
        System.out.println("12345678".substring(3, 5));

        //13.把字符串转换成字符数组
        char[] charArr = "abcdefg".toCharArray();
        System.out.println("toCharArray:" + Arrays.toString(charArr));

        //14.转换大小写
        System.out.println("toUpperCase" + "abc".toUpperCase());
        System.out.println("toLowerCase" + "ABC".toLowerCase());

        //15.除去字符串前后空白
        System.out.println("trim:" + "  abc   ".trim());

        //16.把任何类型转为String--valueOf()
        String str2 = String.valueOf(true);
        System.out.println(str2);

        double d = 2.1234;
        String str3 = String.valueOf(d);
        System.out.println(str3);



    }
}
