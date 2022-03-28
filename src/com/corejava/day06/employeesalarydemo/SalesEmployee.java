package com.corejava.day06.employeesalarydemo;

import java.util.Date;

public class SalesEmployee extends Employee{
    private int sales;
    private float rate;

    public SalesEmployee(){
        super();
    }

    public SalesEmployee(String name, Date birthDay, int sales, float rate){
        super(name, birthDay);
        this.sales = sales;
        this.rate = rate;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public int getSales(){
        return sales;
    }

    public void setRate(float rate){
        this.rate = rate;
    }

    public float getRate(){
        return rate;
    }

    @Override
    public String toString(){
        return super.toString() + " sales=" + sales + " rate=" + rate;
    }

    public double getSalary(int month, int sales, float rate){
        return super.getSalary(month) + sales * rate;
    }
}
