package com.corejava.day09;

/**
 * 2022-03-25
 * Java一共有8种基本数据类型，它们都有各自自己的封装类（对象类型）
 * byte,short,long,float,double -->都是首字母大写：Byte,Short,Long,Float,Double
 * int -> Integer
 * char -> Character
 *
 * 注意：包装类是对象类型，所以它可以提供各种方法供开发使用
 */

public class IntegerDemo {
    public static void main(String[] args){
        //1. 创建Integer对象
        //1.1 常规创建方法(已过时）
        Integer i1 = new Integer(10);
        Integer i2 = new Integer("10");
        System.out.println(i1 + i2);

        //1.2 用过valueOf()方法创建[不推荐]
        //注意：如果传入非字符数字字符串，则抛出异常：java.lang.NumberFormatException
        Integer i3 = Integer.valueOf(10);
        Integer i4 = Integer.valueOf("10");
        System.out.println(i3 + i4);


        //1.3 自动解封箱[推荐]:把一个基本类型直接封装到了一个包装类型中
        //注意：自动封箱本质上调用的就是Integer.valueOf()方法，该方法在-128到127之间时
        //      使用缓冲池中的数据（没有创建新的对象）；而在范围之外时，是new出的全新对象。
        Integer i5 = 10;
        Integer i6 = 10;
        Integer i7 = 129;
        Integer i8 = 129;
        System.out.println("i5与i6:" + (i5 == i6));
        System.out.println("i7与i8:" + (i7 == i8));

        //2. Integer类的常用属性
        System.out.println(Integer.MAX_VALUE);//int范围最大值
        System.out.println(Integer.MIN_VALUE);//int范围最小值

        //3. Integer类的常用方法
        //3.1 转换进制-静态方法
        System.out.println(Integer.toBinaryString(2));
        System.out.println(Integer.toOctalString(8));
        System.out.println(Integer.toHexString(16));

        //3.2 比较大小-通过正零负比较大小
        int r1 = Integer.compare(3, 5);
        System.out.println("r1:" + r1);

        int r2 = i5.compareTo(i7);
        System.out.println("r2:" + r2);

        //3.3 把字符串转换成数字类型（Integer），同valueOf()
        Integer r3 = Integer.decode("123");

        //3.4 把字符串转换成数字类型（int)
        int r4 = Integer.parseInt("123");
        //注意：Integer.decode()和Integer.parseInt()方法都能将字符串转成数字，
        //不同的是decode()方法的返回值是包装类，parseInt()方法返回的是int
        //但是接受返回值的时候Integer和int都能够使用
        //使用Integer接收int类型的时候，使用了自动封箱；使用int类型接收Integer的时候使用到了自动解箱。

        //parseInt()方法有另外一个用法，转换的时候可以指定进制
        int r5 = Integer.parseInt("10", 16);
        System.out.println(r5);



    }
}


