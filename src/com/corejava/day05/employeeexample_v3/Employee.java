package com.corejava.day05.employeeexample_v3;

/**
 * 2022/02/13
 * 本程序为员工实体类
 * 本版本将实现实体类和业务类的分离
 */

public class Employee {
    private String number;
    private String name;
    private double salary;

    //自关联
    private Employee[] employees; //该员工的下属数组

    public void setNumber(String number){
        this.number = number;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public void setEmployees(Employee[] employees){
        this.employees = employees;
    }

    public String getNumber(){
        return number;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public Employee[] getEmployees(){
        return  employees;
    }

    public Employee(){

    }

    public Employee(String number, String name, double salary, Employee[] employees){
        this.number = number;
        this.name = name;
        this.salary = salary;
        this.employees = employees;
    }
}
