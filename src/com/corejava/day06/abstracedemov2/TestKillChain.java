package com.corejava.day06.abstracedemov2;

import org.junit.Test;

public class TestKillChain {
    @Test
    public void testFirstPersion(){
        FirstPersion fp = new FirstPersion();

        fp.topMethod();
    }

    @Test
    public void testSecondPersion(){
        SecondPersion sp = new SecondPersion();

        sp.topMethod();
    }
}
