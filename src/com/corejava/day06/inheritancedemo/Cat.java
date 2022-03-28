package com.corejava.day06.inheritancedemo;

/**
 * 2022/02/15
 * 本类为猫的实体类，用来演示类的继承
 */

public class Cat extends Animal {
    private int meng;

    public Cat(){
        super();
    }

    public Cat(String name, int age, int meng){
        super(name, age);
        this.meng = meng;
    }

    public void setMeng(int meng){
        this.meng = meng;
    }

    public int getMeng() {
        return meng;
    }

    public void climb(){
        System.out.println("猫爬树。");
    }

    @Override
    public String toString(){
        return "Animal{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() + '\n' +
                ", meng=" + meng +
                '}';
    }
}
