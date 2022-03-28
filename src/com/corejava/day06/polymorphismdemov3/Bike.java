package com.corejava.day06.polymorphismdemov3;

public class Bike extends Vehicle{
    public Bike() {
        super();
    }

    @Override
    public void move(double speed){
        System.out.println("自行车的速度=" + speed);
    }
}
