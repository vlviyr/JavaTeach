package com.corejava.day08.testinterface;

import org.junit.runner.manipulation.Ordering;

public class VehicleFactory {
    public static final int BIKE = 1;
    public static final int CAR = 2;

    public static Vehicle getVehicle(int type){
        Vehicle vehicle = null;
        if(type == BIKE){
            vehicle = new Bike();
        }else if(type == CAR){
            vehicle = new Car();
        }else {
            System.out.println("输入参数有误。");
        }
        return vehicle;
    }
}
