package com.corejava.day01;

public class OperateDemo {
    public static void main(String[] args) {
        //简便写法:+=,-=,*=,/=,%=,......
        //优点:简化写法,还可以避免类型转换问题
        //类型转换问题避免后无法保证最终结果的正确性
        byte b = 127;
        //b = b + 1; 编译错误
        b += 1; //编译通过,但是值为-128
        System.out.println(b);
    }
}
