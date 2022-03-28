package com.corejava.day04.employeeexample_v2;

public class TestEmployee2 {
    public static void main(String args[]){
        Employee2 em1 = new Employee2();
        em1.setId(2);
        int id = em1.getId();
        System.out.println(id);

        em1.setName("李四");
        String name = em1.getName();
        System.out.println(name);
    }
}
