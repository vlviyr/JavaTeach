package com.corejava.day05.customerexample;

import java.util.Arrays;
import java.util.Date;

/**
 * 2022/02/12
 * 本类使用来测试消费实体类和订单实体类
 */

public class TestCustomerAndOrder {
    public static void main(String[] args){
        //创建一个没有任何订单的消费者
        Customer customer1 = new Customer("张三", "110");
        customer1.showCustomer();

        //创建一个能购物（向订单数组中添加订单）的消费者
        Order[] orders = {};
        Customer customer2 = new Customer("李四", "120", orders);
        //Customer customer2 = new Customer("李四", "120", new Order[]{});

        //创建两个订单
        Order order1 = new Order("EN001", 9999, new Date(), customer2);
        Order order2 = new Order("EN002", 19999, new Date(), customer2);
        //将订单关联到消费者中
        orders = Arrays.copyOf(customer2.getOrders(), customer2.getOrders().length + 2);
        orders[orders.length - 2] = order1;
        orders[orders.length - 1] = order2;
        customer2.setOrders(orders);
        customer2.showCustomer();

        //1、访问顾客姓名
        System.out.println(customer2.getName());

        //2、访问顾客订单个数
        System.out.println(customer2.getOrders().length);

        //3、访问顾客第二个订单的价格
        System.out.println(customer2.getOrders()[1].getPrice());

        //4、修改顾客第一个订单的价格
        customer2.getOrders()[0].setPrice(9888);
        System.out.println(customer2.getOrders()[0].getPrice());

        //5、查看第二个订单所属的顾客
        System.out.println(orders[1].getCustomer().getName());

    }
}
