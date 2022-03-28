package com.corejava.day04.employeeexample_v1;

/**
 * Employee的测试类
 */
public class TestEmployee {
    public static void main(String args[]){
        Employee em1 = new Employee();
        em1.id = 01;
        em1.name = "张三";
        em1.title = "总书记";
        em1.salary = 10.2;

        em1.work();
        em1.rest();
    }
}
