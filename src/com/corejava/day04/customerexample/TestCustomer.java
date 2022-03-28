package com.corejava.day04.customerexample;

import com.corejava.day04.customerexample.Customer;

public class TestCustomer {
    public static void main(String args[]){
        Customer cu1 = new Customer();
        cu1.setName("张三");
        cu1.setAddress("松花江");
        cu1.shopping();

        Customer cu2 = new Customer("李四", "鸭绿江");
        cu2.shopping();
    }
}
