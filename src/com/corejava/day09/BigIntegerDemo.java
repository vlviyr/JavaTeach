package com.corejava.day09;

import com.corejava.day08.exercise2.B;

import java.math.BigInteger;

/**
 * 2022-03-27
 * 本类用来演示java大数字类型
 */
public class BigIntegerDemo {
    public static void main(String[] args){
        //1. 创建大整数对象
        BigInteger num1 = new BigInteger("11111111111111111111111111111111111");
        BigInteger num2 = new BigInteger("88888888888888888888888888888888888");

        //2. 大整数的计算
        BigInteger r1 = num1.add(num2);
        BigInteger r2 = num2.subtract(num1);
        BigInteger r3 = num1.multiply(num2);
        BigInteger r4 = num2.divide(num1);

        System.out.println(r1 + "\n" + r2 + "\n" + r3 + "\n" + r4);

        System.out.println(fac(500));

    }

    public static BigInteger fac(int num){
        BigInteger tmp = new BigInteger(num + "");
        if(num == 1){
            return BigInteger.ONE;
        }
        return tmp.multiply(fac(num -1));
    }

}
