package com.corejava.day08.exercise;

public class InB implements InA{

    @Override
    public void showA() {
        System.out.println("普通类InB中重写的showA方法。");
    }
}
