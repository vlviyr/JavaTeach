package com.corejava.day08.exercise4;

import org.junit.Test;

public class TestUniverse {
    @Test
    public void test(){
        Universe un = new Sun();

        un.doAnything();

        //无法直接调用star，调用前需要向下转型，转型前先进行判断
        Star star = (Star) un;
        star.shine();
    }
}
