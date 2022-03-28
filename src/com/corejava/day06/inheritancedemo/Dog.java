package com.corejava.day06.inheritancedemo;

/**
 * 2022/02/15
 * 本类为狗的实体类，用来演示类的继承
 */

public class Dog extends Animal{
    private int zhong;

    public Dog(){

    }

    public Dog(int zhong){
        super();
        this.zhong = zhong;
    }

    public void setZhong(int zhong) {
        this.zhong = zhong;
    }

    public int getZhong() {
        return zhong;
    }

    public void swim(){
        System.out.println("狗在游泳。");
    }

    @Override
    public String toString(){
        return "Animal{" +
                "name='" + super.getName() + '\'' +
                ", age=" + getAge() + '\n' +
                ", zhong=" + zhong +
                '}';
    }
}
