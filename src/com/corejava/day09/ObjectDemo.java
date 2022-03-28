package com.corejava.day09;

/**
 * 2022-03-11
 * 本类用来演示java.lang.Object
 * 它是所有Java类的顶级父类，所有类都直接或者间接继承于它
 *
 * 1. finalize():JVM的垃圾回收器（GC）在回收垃圾之前会调用该方法来确定该对象是否是垃圾对象
 *      注意：
 *          1. 此方法在一个对象上永远只执行一次
 *          2. 此方法在JDK9时已经过时（不代表不能使用，但是不推荐使用）
 *
 * 2、toString()：打印任何对象时，都会自动调用该对象的toString()方法
 *  Object类中的toString()方法默认格式为：类的全限定名 + @ + 内存地址（hashCode的16进制）
 *  可以在子类中对toString()方法进行重写，从而达到输出自定义结果的效果
 *  例如：java.util.Date, java.util.Calendar, java.util.ArrayList, java.lang.String...
 *
 *  3. clone():克隆对象
 *      克隆步骤：
 *          1. 重写clone()方法，把修饰符从protected改成public
 *          2. 被克隆的对象必须实现java.lang.Cloneable标记接口，否则抛出java.lang.CloneNotSupportedException异常
 *
 *      克隆的结果：
 *          1. 克隆出的对象和原对象是两个不同的对象（内存地址不同）
 *          2. 克隆出的对象和原对象基本属性（包括日期，字符串等常用对象）是完全新的克隆，而对象属性是两个对象共享的
 *
 *      Object中的clone()方法是以浅层复制（基本类型复制一份，对象类型共享）的方式来拷贝对象的，如果要实现深层复制，则自行重写clone()方法来实现。
 *
 * 4. getClass():得到当前对象的运行时类型
 *      例如： Animal a = new Cat();
 *            Class<?> c = a.getClass();
 *            //Class<?>是泛型
 *            //Class类是用来描述类的类，即从Class类的对象中可以获取类的所有相关信息
 *
 *            获取类名：c.getName()
 *            获取父类类名：c.getSuperClass().getName()
 *            获取包：c.getPackageName()
 *
 *      一个类可以有多个对象，但是一个类的类型有且只有一个
 *
 *
 * 5. equals()
 *      1.比较：
 *          == 等号只能用于比较内存地址
 *          Object.equals() 默认比较内存地址，但是可以通过重写，改变规则
 *          例如：java.lang.String类中重写了equals()方法，重写方法使得该类下的equals比较的是值。
 *      2.重写equals()方法
 *          a.
 * 6. hasCode()
 *      重写hashCode()方法的目的：
 *      equals()方法返回true表示是同一个对象，则内存地址一定相等
 *      equals()方法返回false表示的是不同对象，则内存地址尽可能不同
 *      即：equals()和hashCode()两个方法可以通过系统生成，系统生成的方法算法质量较高，不同对象得到的相同hashCode的概率极低。
 * 7.判断两个对象是否是同一个对象先调用hasCode()，再调用equals()方法
 */

public class ObjectDemo {
    public static void main(String[] args){

    }
}

class Student{

}
