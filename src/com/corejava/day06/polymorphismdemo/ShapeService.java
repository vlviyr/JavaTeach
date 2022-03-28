package com.corejava.day06.polymorphismdemo;

public class ShapeService {

    //以下六个方法用来演示无多态环境下的情况
    public void recLength(Rectangle rec){
        System.out.println(rec.length());
    }

    public void recArea(Rectangle rec){
        System.out.println(rec.area());
    }

    public void cirLength(Circle cir){
        System.out.println(cir.length());
    }

    public void cirArea(Circle cir){
        System.out.println(cir.area());
    }

    public void squLength(Square squ){
        System.out.println(squ.length());
    }

    public void squArea(Square squ){
        System.out.println(squ.area());
    }

    //以下两个方法用来演示存在多态方法的情况
    public void showLength(Shape shape){
        System.out.println(shape.length());
    }

    public void showArea(Shape shape){
        System.out.println(shape.area());
    }


}
