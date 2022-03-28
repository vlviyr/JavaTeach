package com.corejava.day04.employeeexample_v2;

/**
 * 员工实体类
 */
public class Employee2 {
    //封装属性 -- 私有化属性， 提供get/set方法来获取/设置属性
    //注意：除了常量属性以外，一般我们把属性定义成私有化的
    private int id;
    private String name;
    private String title;
    private double salary;

    // 为私有化属性提供存取方法
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }



    // 方法
    public void work(){
        System.out.printf("%s的编号是%d，职称是%s，薪资是%.1f，他正在工作。\n", name, id, title, salary);
    }

    public void rest(){
        System.out.printf("%s的编号是%d，职称是%s，薪资是%.1f，他正在休息。\n", name, id, title, salary);
    }
}
