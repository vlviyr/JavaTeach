package com.corejava.day06.polymorphismdemov3;

public class Plane extends Vehicle{
    public Plane() {
        super();
    }

    @Override
    public void move(double speed){
        System.out.println("飞机的速度=" + speed);
    }
}
