package com.corejava.day06.polymorphismdemov2;

import com.corejava.day06.polymorphismdemo.Shape;
import org.junit.Test;

/**
 * 2022/02/17
 * 本类为测试类，用来演示多态的使用
 *
 * 多态的体现--对象编译时类型写成父类
 *
 * 语法：编译时类型 变量= new 运行时类型()
 *
 * 注意：
 * 1、一个对象的编译时类型决定了该变量可以访问的成员
 * 2、静态方法没有多态特性
 *
 * 多态产生的弊端：父类无法调用子类特有的方法
 * 解决方式：对父类对象进行强制类型转换
 *     注意：由于此处强制类型转换可能存在类型转换异常，所以要提前判断类型是否一致
 *
 * A instanceof B
 * A如果是B的类型或者子类类型，则返回True，否则返回False
 */
public class TestFather {
    @Test
    public void test(){
        Father father = new Son();
        System.out.println(father.x);
        System.out.println(Father.y);
    }

    @Test
    public void testMethod(){
        Father father = new Son();
        father.work();
        Father.smoke();

        //多态弊端的解决
        if(father instanceof Father){
            Son son = (Son) father;
            son.eat();
        }else {
            System.out.println("类型转换错误。");
        }
    }
}
