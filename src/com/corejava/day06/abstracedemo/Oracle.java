package com.corejava.day06.abstracedemo;

/**
 * 2022/02/18
 * 本类重写StudentService中的方法
 * 用来演示抽象函数和抽象方法的使用
 */

public class Oracle extends StudentService{
    @Override
    public void insertStudent() {
        System.out.println("使用Oracle增添学生信息");
    }

    @Override
    public void deleteStudent() {
        System.out.println("使用Oracle增添学生信息");
    }

    @Override
    public void updateStudent() {
        System.out.println("使用Oracle增添学生信息");
    }

    @Override
    public Student[] selectStudents() {
        System.out.println("使用Oracle增添学生信息");
        return new Student[0];
    }
}
