package com.corejava.day06.employeesalarydemo;

import java.util.Date;

public class BasePlusSalesEmployee extends SalesEmployee{
    private double baseSalary;

    public BasePlusSalesEmployee(){
        super();
    }

    public BasePlusSalesEmployee(String name, Date birthDay, int sales, float rate, double baseSalary){
        super(name, birthDay, sales, rate);
        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getFixedSalary(){
        return baseSalary;
    }

    @Override
    public String toString() {
        return super.toString() + " baseSalary=" + baseSalary;
    }

    public double getSalary(int month, int sales, float rate, double baseSalary){
        return super.getSalary(month, sales, rate) + baseSalary;
    }
}
