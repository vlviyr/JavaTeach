package com.corejava.day06.abstracedemo;

/**
 * 2022/02/18
 * 本类重写StudentService类中的方法
 */

public class MySql extends StudentService{
    @Override
    public void insertStudent() {
        System.out.println("使用MySql增添学生信息");
    }

    @Override
    public void deleteStudent() {
        System.out.println("使用MySql删除学生信息");
    }

    @Override
    public void updateStudent() {
        System.out.println("使用MySql更新学生信息");
    }

    @Override
    public Student[] selectStudents() {
        System.out.println("使用MySql查询学生信息");
        return new Student[0];
    }
}
