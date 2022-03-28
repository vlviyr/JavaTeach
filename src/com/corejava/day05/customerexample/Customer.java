package com.corejava.day05.customerexample;

/**
 * 创建时间：2022/02/12
 * 该示例是消费者实体类
 */

public class Customer {
    private String name;
    private String phone;
    //关联订单（一对多）
    private Order[] orders;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }

    public Order[] getOrders() {
        return orders;
    }

    //构造函数
    public Customer(String name, String phone) {
        this.name = name;
        this.phone = phone;
        System.out.println("构造成功");
    }

    public Customer(String name, String phone, Order[] orders) {
        this.name = name;
        this.phone = phone;
        this.orders = orders;
    }

    //实体类中的方法
    public void showCustomer(){
        System.out.printf("姓名：%s\n电话：%s\n订单数量：%d\n", name, phone, (orders == null?0:orders.length));
    }


}
