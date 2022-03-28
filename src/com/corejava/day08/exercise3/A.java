package com.corejava.day08.exercise3;

public interface A {
    void showA();

    private void showA3(String str){
        for(int i=0; i<3; i++){
            System.out.println(str);
        }
    }

    default void showB(String str){
        showA3(str);
    }

    default void showC(String str){
        showA3(str);
    }
}