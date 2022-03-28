package com.corejava.day08.testinterface;

/**
 * 业务类实现的不同方法，例如密码登录、短信登录、指纹登录、人脸识别登录。。。。
 */
public class VehicleServiceImpl2 implements VehicleService{

    //创建一个私有的静态对象
    private static VehicleServiceImpl2 vs2 = new VehicleServiceImpl2();

    //私有化构造函数，让类无法被实例化
    public VehicleServiceImpl2(){

    }

    //创建一个公开静态方法，返回唯一的私有静态对象
    public static VehicleServiceImpl2 getInstance(){
        return vs2;
    }



    @Override
    public void run(Vehicle vehicle) {
        System.out.println("方案B：交通工具在前进。");
    }
}
