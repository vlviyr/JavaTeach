package com.corejava.day06.polymorphismdemo;

import org.junit.Test;

/**
 * 2022/02/17
 * 本类为用来演示多态
 */

public class TestShape {
    @Test
    //该方法用来演示不存在业务类情况下的测试
    public void test(){
        Rectangle re = new Rectangle(3, 4);
        System.out.println(re.length());
        System.out.println(re.area());

        Circle cir = new Circle(1);
        System.out.println(cir.length());
        System.out.println(cir.area());

        Square sq = new Square(2);
        System.out.println(sq.length());
        System.out.println(sq.area());
    }

    @Test
    //该方法用来演示存在业务类情况下的测试
    public void testService(){
        ShapeService ss = new ShapeService();

        Rectangle rec = new Rectangle(3, 4);
        ss.recLength(rec);
        ss.recArea(rec);

        Circle cir = new Circle(1);
        ss.cirLength(cir);
        ss.cirArea(cir);

        Square squ = new Square(2);
        ss.squLength(squ);
        ss.squArea(squ);


    }

    @Test
    //该方法用来演示存在多态情况下的测试
    public void testPolymorphism(){
        ShapeService ss = new ShapeService();
        Rectangle rec = new Rectangle(3, 4);
        ss.showLength(rec);
        ss.showArea(rec);

        Circle cir = new Circle(1);
        ss.showLength(cir);
        ss.showArea(cir);

        Square squ = new Square(2);
        ss.showLength(squ);
        ss.showArea(squ);


    }


}
