package com.corejava.day06.employeesalarydemo;

import org.w3c.dom.css.CSSUnknownRule;

import java.util.Date;

/**
 * 2022/02/15
 * 本类为固定工资员工类
 */

public class SalariedEmployee extends Employee{
    //固定员工的特有属性--固定薪资
    private double fixedSalary;

    public SalariedEmployee(){
        super();
    }

    public SalariedEmployee(String name, Date birthDate, double fixedSalary){
        super(name, birthDate);
        this.fixedSalary = fixedSalary;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public double getFixedSalary(){
        return fixedSalary;
    }

    @Override
    public String toString(){
        return super.toString() + " fixedSalalry=" + fixedSalary;
    }

    public double getSalary(int month){
        return super.getSalary(month) + fixedSalary;
    }
}
