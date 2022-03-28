package com.corejava.day06.employeesalarydemo;

import com.corejava.util.DateUtil;

import java.util.Calendar;
import java.util.Date;

/**
 * 2022/02/15
 * 本类为所有员工类的父类
 */

public class Employee {
    private String name;
    private Date birthDay;

    public Employee(){

    }

    public Employee(String name, Date birthDay){
        this.name = name;
        this.birthDay = birthDay;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public Date getBirthDay(){
        return birthDay;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", birthDay=" + DateUtil.formatDate(birthDay) +
                '}';
    }

    public double getSalary(int month){
        double salary = 0.0;
        Calendar cal = Calendar.getInstance();
        cal.setTime(birthDay);
        int birthMonth = cal.get(Calendar.MONTH) + 1;
        if(birthMonth == month){
            salary += 100;
        }
        return salary;
    }
}
