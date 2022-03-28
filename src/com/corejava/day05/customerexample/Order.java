package com.corejava.day05.customerexample;
/**
 * 2022/02/12
 * 该示例用来演示订单的实体类
 */


import java.util.Date;

public class Order {
    private String orderNum;
    private double price;
    private Date createDate;
    //关联消费者（多对一）
    private Customer customer;

    //为订单实体类的私有化属性提供存取方法
    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public double getPrice() {
        return price;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCustomer(Customer customer){
        this.customer = customer;
    }

    public Customer getCustomer(){
        return customer;
    }

    //为订单实体类提供构造方法
    public Order(String orderNum, double price, Date createDate, Customer customer) {
        this.orderNum = orderNum;
        this.price = price;
        this.createDate = createDate;
        this.customer = customer;
    }

    //为订单实体类提供操作方法
    public void showOrder(){
        System.out.printf("订单编号：%s\n订单价格：%f\n订单创建时间：%s\n订单顾客：%s", orderNum, price, createDate, customer.getName());
    }

}
