package com.corejava.day05.thisdemo;

/**
 * 2022.02.14
 * 本类用来示例this关键字
 *
 * This关键字的作用
 * 1、用来表示当前对象
 * 2、表示当前对象的构造方法
 */


public class ComputerDemo {
    private String brand;
    private double price;

    public ComputerDemo(double price){
        //表示当前对象
        this.price = price;
    }

    public ComputerDemo(String brand, double price){
        //表示当前对象的构造方法
        this(price);

        this.brand = brand;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }
}
