package com.corejava.day08.testinterface;

import static com.corejava.day08.testinterface.VehicleFactory.*;

import org.junit.Test;

public class TestVehicle {
    @Test
    public void test() throws InterruptedException {
        Vehicle v1 = new Bike();
        v1.move(80);

        Vehicle v2 = VehicleFactory.getVehicle(1);
        v2.setSpeed(90);
        //静态导入情况下获取实例
        Vehicle v3 = getVehicle(2);

        Vehicle v4 = getVehicle(2);
        v4.setSpeed(100);

        VehicleServiceImpl1 vs1 = VehicleServiceImpl1.getInstance();
        System.out.println("-------------");

        System.out.println("自行车：");
        Thread.sleep(300);
        vs1.run(v2);
        System.out.println("-------------");
        System.out.println("汽车：");
        Thread.sleep(300);
        vs1.run(v4);
        System.out.println("-------------");
        VehicleServiceImpl2 vs2 = VehicleServiceImpl2.getInstance();
        vs2.run(v3);
        //调用对象的特有方法
        if(v2 instanceof Bike){
            Bike bike = (Bike)v2;
            bike.bikeMethod();
        }
    }
}
