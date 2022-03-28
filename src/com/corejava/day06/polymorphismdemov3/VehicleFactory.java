package com.corejava.day06.polymorphismdemov3;

/**
 * 2022/02/17
 * 本类用来演示
 */
public class VehicleFactory {
    public static final int BIKE = 1;
    public static final int CAR = 2;
    public static final int PLANE = 3;

    //多态--返回方法写成父类
    public static Vehicle getVehicle(int type){
        Vehicle vehicleType = null;
        if(type == 1){
            vehicleType = new Bike();
        }else if(type == 2){
            vehicleType = new Car();
        }else if(type == 3){
            vehicleType = new Plane();
        }
        return vehicleType;
    }
}
