package com.corejava.day06.employeesalarydemo;

import org.junit.Test;

import java.util.Date;

/**
 * 2022/02/15
 * 本类为所有员工类的测试类
 */

public class TestEmployees {
    @Test
    public void testEmp(){
        Employee emp = new Employee("张三", new Date());
        System.out.println(emp);

        SalariedEmployee semp = new SalariedEmployee("李四", new Date(), 5000);
        System.out.println(semp);
        System.out.println("Total salary=" + semp.getSalary(4));

        HourlyEmployee he = new HourlyEmployee("王五", new Date(), 100);
        System.out.println(he);
        System.out.println("Total Salary=" + he.getSalary(3, 200));

        SalesEmployee sam = new SalesEmployee("王五", new Date(), 10000, 0.5f);
        System.out.println(sam);
        System.out.println("Total Salary=" + sam.getSalary(2, 10000, 0.5f));

        BasePlusSalesEmployee bpse = new BasePlusSalesEmployee("马六", new Date(), 10000, 0.5f, 2000);
        System.out.println(bpse);
        System.out.println("Total Salary=" + bpse.getSalary(1, 10000, 0.5f, 2000));
    }
}
