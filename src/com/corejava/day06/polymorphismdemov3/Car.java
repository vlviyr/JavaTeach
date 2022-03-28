package com.corejava.day06.polymorphismdemov3;

public class Car extends Vehicle{

    public Car() {
        super();
    }

    @Override
    public void move(double speed){
        System.out.println("汽车的速度=" + speed);
    }

    public void transform(){
        System.out.println("汽车人变形。");
    }
}
