package com.corejava.day08.testinterface;

public class Car extends Vehicle implements CheckSpeed{

    @Override
    public void move(double speed) {
        System.out.println("汽车以每小时" + speed + "km/h的速度前进。");
    }
}
