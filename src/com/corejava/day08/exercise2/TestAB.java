package com.corejava.day08.exercise2;

import org.junit.Test;

public class TestAB {
    @Test
    public void test(){
        A a = new B();
        a.showA();
        a.showB("AA");
        a.showC("BB");
    }
}
