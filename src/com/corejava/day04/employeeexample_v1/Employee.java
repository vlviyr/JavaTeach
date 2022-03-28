package com.corejava.day04.employeeexample_v1;

/**
 * 员工实体类
 */
public class Employee {
    int id;
    String name;
    String title;
    double salary;

    public void work(){
        System.out.printf("%s的编号是%d，职称是%s，薪资是%.1f，他正在工作。\n", name, id, title, salary);
    }

    public void rest(){
        System.out.printf("%s的编号是%d，职称是%s，薪资是%.1f，他正在休息。\n", name, id, title, salary);
    }
}
