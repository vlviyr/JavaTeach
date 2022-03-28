package com.corejava.day06.finaldemo;

/**
 * 2022/02/17
 * 本类用来演示final关键字的用法
 *
 * 1、修饰局部变量
 *    表示这个局部变量是常量
 *
 *    特点：
 *    a、创建常量后，在使用前要初始化
 *    b、一但赋值，无法改变
 *    c、比字面量携带更多的信息，提高代码的可读性
 * 2、修饰属性
 *    表示这个属性是常量属性
 *
 *    特点：
 *    a、属性的声明和赋值要同时进行
 *    b、可以通过静态代码块给常量赋值
 *
 * 3、修饰方法
 *    表示该方法无法被重写
 *
 * 4、修饰类
 *    表示该类无法被继承
 */






final class FinalFather{
    private int a = 2;
}

/*class FinalSon extends FinalFather{

}*/ //报错，无法修饰使用final修饰的类




public class FinalDemo {
    public static final double PI = 3.14;
    public static int c;

    public final void test(){
        System.out.println("父类方法");
    }

    public static void main(String[] args){
        FinalSonTest fst = new FinalSonTest();
        System.out.println(fst.a);
    }

}

//该类前如果存在修饰符final，则FinalFatherTest会报错，无法继承被final修饰的类
class FinalFatherTest{
    int a = 3;

    public FinalFatherTest(){

    }
}

class FinalSonTest extends FinalFatherTest{
    public FinalSonTest() {
        super();
    }

}





