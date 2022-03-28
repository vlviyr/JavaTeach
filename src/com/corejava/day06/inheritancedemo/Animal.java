package com.corejava.day06.inheritancedemo;

/**
 * 2022/02/15
 * 本类为动物的实体类，用来演示类的继承
 */

public class Animal {
    private String name;
    private int age;

    public Animal(){

    }

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void eat(){
        System.out.printf("%s正在吃东西。\n", name);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
