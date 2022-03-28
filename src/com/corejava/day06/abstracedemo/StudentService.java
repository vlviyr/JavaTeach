package com.corejava.day06.abstracedemo;

/**
 * 2022/02/18
 * 本类为学生相关的业务类，作用是实现学生信息的增删改查
 * 本类用来演示抽象类和方法的使用
 */

public abstract class StudentService {
    //实现学生信息的添加功能
    public abstract void insertStudent();
    //实现学生信息的删除功能
    public abstract void deleteStudent();
    //实现学生信息的修改
    public abstract void updateStudent();
    //实现学生信息的查询功能
    public abstract Student[] selectStudents();

}
