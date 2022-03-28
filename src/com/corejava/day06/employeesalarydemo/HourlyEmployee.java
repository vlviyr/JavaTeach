package com.corejava.day06.employeesalarydemo;

import java.util.Date;

public class HourlyEmployee extends Employee{
    private static final int EACH_HOUR_PAY = 10;
    private double hours;

    public HourlyEmployee(){
        super();
    }

    public HourlyEmployee(String name, Date birthDay, double hours){
        super(name, birthDay);
        this.hours = hours;
    }

    public void setHours(double hours){
        this.hours = hours;
    }

    public double getHours(){
        return hours;
    }

    @Override
    public String toString(){
        return super.toString() + " hour=" + hours;
    }

    public double getSalary(int month, double hours){
        double salary = 0.0;
        salary = super.getSalary(month) + hours * EACH_HOUR_PAY;
        if(hours > 160){
            salary += (hours - 160) * EACH_HOUR_PAY * 0.5;
        }
        return salary;
    }

}
