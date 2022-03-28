package com.corejava.day05.computerexample;

public class Screen {
    String brand;
    double size;

    public Screen(){
        /*
        存在自定义构造方法的情况下提供空参构造器
         */
    }

    public Screen(String brand, double size){
        /*
        自定义构造方法
         */
        this.brand = brand;
        this.size = size;
    }

    public String showScreen(){
        return "屏幕品牌:" + brand + "\n" + "屏幕尺寸:" + size + "\n";
    }
}
