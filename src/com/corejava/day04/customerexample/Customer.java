package com.corejava.day04.customerexample;

/**
 * 消费者实体类
 *
 * 该类用来演示构造方法--创建对象的同时给对象赋值
 *
 * 注意：
 * 1.构造方法没有返回类型
 * 2.构造方法的方法名与类名一致
 * 3.一个类中如果没有提供任何构造方法，则系统会自动提供一个空参构造器
 *   如果一个类中已经定义了构造方法， 则系统就不会再自动提供默认的空参构造器
 *
 * 构造方法可以利用开发工具自动生成。
 *
 * 构造方法和set方法的一统
 *
 * 相同：
 * 都可以给对象复制
 *
 * 不同：
 * 1.赋值时机不同，构造方法是再创建对象时赋值，set方法是再创建对象后赋值
 * 2.使用次数不同，构造方法只能使用一次来赋值，set方法可以使用任意多次
 * 3.验证方式不同，默认构造方法无法判断（自定义构造方法可以），set方法可以添加参数验证
 *
 * 自定义构造方法对参数验证时，可以调用已经存在验证的set方法来实现。
 *
 *
 */
public class Customer {
    String name;
    String address;

    public Customer(){

    }

    public Customer(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public void shopping(){
        System.out.printf("正在购物的%s住在%s。\n", name, address);
    }
}
