package com.corejava.day06.polymorphismdemo;

/**
 * 2022/02/17
 * 本类为长方形类，用来演示多态
 */

public class Rectangle extends Shape{
    private double len;
    private double wide;

    public Rectangle(double len, double wide){
        this.len = len;
        this.wide = wide;
    }

    public void setLen(double len) {
        this.len = len;
    }

    public double getLen(){
        return len;
    }

    public void setWide(double wide){
        this.wide = wide;
    }

    @Override
    public double length(){
        return 2 * (len + wide);
    }

    @Override
    public double area(){
        return len * wide;
    }
}















