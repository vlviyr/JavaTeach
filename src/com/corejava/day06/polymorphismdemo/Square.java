package com.corejava.day06.polymorphismdemo;

public class Square extends Rectangle{
    private double l;
    
    public Square(double l) {
        super(l, l);
    }
    
    public void setL(double l) {
        this.l = l;
    }
    
    public double getL() {
        return l;
    }
}
