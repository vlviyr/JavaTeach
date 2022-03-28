package com.corejava.day08.exercise;

import org.junit.Test;

public class TestAB {
    @Test
    public void test(){
        //多态：对象的编译时类型携程父类（接口）
        InA inA = new InB();

        inA.showA();
        inA.showB();

        //调用类中的静态方法，类名.方法名
        InA.showC();
    }
}
