package com.corejava.day08.testinterface;

import lombok.Data;

//交通
@Data
public abstract class Vehicle implements Moveable{
    private double speed;
}
