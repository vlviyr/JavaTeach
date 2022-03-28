package com.corejava.day06.inheritancedemov3;

public class Worf extends Animal{
    private String name;
    private double weight;

    public Worf(String name, double weight){
        super();
        this.name = name;
        this.weight = weight;
    }

    public String getDesc(){
        return "Worf=" + name + "和" + "Weight=" + weight;
    }

    public static void main(String[] args){
        System.out.println(new Worf("狼", 10));
        Worf w = new Worf("狼1", 20);
        System.out.println(w);
    }
}
