package com.corejava.day08.exercise;

public interface InA {
    void showA();

    default void showB(){
        System.out.println("接口中的默认方法。");

    }

    static void showC(){
        System.out.println("调用InA中的C方法.");
    }

}
