package com.corejava.day08.exercise3;

public class B implements A{
    @Override
    public void showA() {
        System.out.println("类B重写接口A中的方法showA。");
    }

    public static void showD(){
        System.out.println("showD");
    }
}
