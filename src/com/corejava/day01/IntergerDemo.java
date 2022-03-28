package com.corejava.day01;

public class IntergerDemo {
        public static void main(String[] args) {
            //将十进制数值转为二进制、八进制、十六进制
            System.out.println(Integer.toBinaryString(-2));
            System.out.println(Integer.toBinaryString(2));
            System.out.println(Integer.toOctalString(8));
            System.out.println(Integer.toHexString(16));
            //将二进制、八进制、十六进制转换为十进制
            System.out.println(Integer.parseInt("10", 2));
            System.out.println(Integer.parseInt("10", 8));
            System.out.println(Integer.parseInt("10", 16));
        }
}
