package com.corejava.day05.computerexample;

public class Computer {
    String brand;
    double price;
    Screen screen;

    public Computer(){
        /*
        存在自定义构造方法的情况下，提供空参构造器
         */
    }

    public Computer(String brand, double price, Screen screen){
        /*
        自定义构造方法
         */
        this.brand = brand;
        this.price = price;
        this.screen = screen;
    }

    public void showComputer(){
        String test = screen.showScreen();
        System.out.println("品牌：" + brand + "\n" + test + "价格：" + price);
    }

}
