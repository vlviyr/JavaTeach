package com.corejava.day05.junit4demo;

/**
 * 2022/02/14
 * 本类用来演示使用Junit4进行单元测试
 */

public class CalculatorDemo {
    //加法
    public int add(int a, int b){
        return a + b;
    }

    //减法
    public int sub(int a, int b){
        return a - b;
    }

    //除法
    public int div(int a, int b){
        if(b == 0){
            throw new ArithmeticException("除数不能为0！");
        }
        return a/b;
    }

    //覆盖率测试
    public void cover(int a){
        switch (a){
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            default:
                System.err.println("Default");
                break;
        }
    }

    public void mul(){
        System.out.println("multiply");
    }
}
