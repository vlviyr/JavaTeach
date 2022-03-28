package com.corejava.day06.inheritancedemo;

import org.junit.Test;

/**
 * 2022/02/15
 * 本类为测试类，用来演示类的继承
 *
 * this和super关键字：
 *
 * 作用一：
 * this调用当前类的属性或者方法；super调用父类的属性或者方法
 *
 * 作用二：
 * this调用当前类的某个指定构造方法；super调用父类某个指定的构造方法
 *
 * 注意：this和super表示构造时，必须要放在构造方法的第一行
 */


public class TestAnimals {

    //测试动物类
    @Test
    public void testAnimal(){
        Animal bird = new Animal("鸟", 16);
        bird.eat();

        String testString = bird.toString();
        System.out.println(testString);
    }

    //测试猫类
    @Test
    public void testCat(){
        Cat cat = new Cat();
        cat.setName("猫");
        cat.eat();
        cat.setMeng(80);
        System.out.println(cat.getMeng());
        cat.climb();

        String testString = cat.toString();
        System.out.println(testString);


        Cat cat1 = new Cat("猫", 34, 78);
        System.out.println("cat1-toString："  + cat1.toString());
    }

    //测试狗类
    @Test
    public void testDog(){
        Dog dog = new Dog();
        dog.setName("狗");
        dog.setAge(20);
        dog.eat();
        dog.setZhong(100);
        System.out.println(dog.getZhong());
        dog.swim();

        String testString = dog.toString();
        System.out.println(testString);
    }


}
