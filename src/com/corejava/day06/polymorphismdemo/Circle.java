package com.corejava.day06.polymorphismdemo;

/**
 * 2022/02/17
 * 本类为长方形类，用来演示多态
 */

public class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    @Override
    public double length(){
        return 2 * Math.PI * radius;
    }

    @Override
    public double area(){
        return Math.PI * radius * radius;
    }

}
