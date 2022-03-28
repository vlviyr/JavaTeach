package com.corejava.day06.polymorphismdemov3;

import org.junit.Test;

import static com.corejava.day06.polymorphismdemov3.VehicleFactory.*;

/**
 * 2022/02/17
 * Java中有23中设计模式，解决23大类问题的公式代码（思路），用来完成23中特定情况下的编程
 * 本类使用了23种设计模式之一：工厂模式（简单工厂分支）用来批量创建实例
 */

public class TestVehicle {
    @Test
    public void testVehicle(){
        Vehicle ve = new Vehicle();
        ve.move(0);
    }

    @Test
    public void testCar(){
        Vehicle ve = new Car();
        ve.move(60);
        //利用父类引用调用子类特性
        Car ca = (Car) ve;
        ca.transform();
    }

    @Test
    //测试工厂和返回方法的多态
    public void testFactory() {
        //使用父类类创建一个具体的交通工具
        Vehicle car1 = new Car();
        car1.move(50);
        //使用工厂创建创建一个具体的交通工具书
        Vehicle car2 = getVehicle(2);
        car2.move(60);
        //使用常量提高代码可读性
        Vehicle car3 = getVehicle(VehicleFactory.CAR);
        car3.move(70);
        //使用静态导入优化代码
        Vehicle car4 = getVehicle(CAR);
        car4.move(80);

        //使用工厂和数组创建多个交通工具
        Vehicle v;
        Vehicle[] vehicles = new Vehicle[10];
        for(int i = 0; i < 10; i++) {
            int type = (int) (Math.random() * 3 + 1);
            v = getVehicle(type);
            vehicles[i] = v;
        }
        //输出数组中创建的交通工具
        for(Vehicle ve : vehicles){
            ve.move(100);
        }
    }

    @Test
    //测试参数列表多态
    public void testVehicleService(){
        VehicleService vs = new VehicleService();
        Bike bike = new Bike();
        vs.vehicleMove(bike);

        Car car = new Car();
        vs.vehicleMove(car);

        Plane plane = new Plane();
        vs.vehicleMove(plane);

    }
}
