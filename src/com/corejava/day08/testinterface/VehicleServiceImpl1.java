package com.corejava.day08.testinterface;

/**
 * 业务类实现的不同方法，例如密码登录、短信登录、指纹登录、人脸识别登录。。。。
 */
public class VehicleServiceImpl1 implements VehicleService{

    //二、提供一个静态的私有成员属性，返回一个对象
    private static VehicleServiceImpl1 vs1 = new VehicleServiceImpl1();

    //一、私有化构造函数，这样类就不会被实例化。
    private void VehicleService(){

    }

    //三、提供一个公开静态的方法，返回唯一可用的对象。
    public static VehicleServiceImpl1 getInstance(){
        return vs1;
    }

    @Override
    public void run(Vehicle vehicle) {
        //判断对象是否有标记接口，从而实现不同的处理策略
        if(vehicle instanceof CheckSpeed){
            if(vehicle.getSpeed() > 80){
                System.err.println("行驶超速。");
            }else {
                System.out.println("方案A：交通工具在前进。");
            }
        }else {
            System.out.println("方案A：交通工具在前进。");
        }

    }
}
