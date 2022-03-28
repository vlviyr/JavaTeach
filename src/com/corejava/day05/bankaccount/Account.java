package com.corejava.day05.bankaccount;

/**
 * 2022/02/13
 * 本类为银行账户实体类
 * 本示例用来演示无任何关联的单实体
 */

public class Account {
    private long id;
    private String cardNumber;
    private String password;
    private double balance;

    public Account(){

    }

    public Account(long id, String cardNumber, String password, double balance){
        this.id = id;
        this.cardNumber = cardNumber;
        this.password = password;
        this.balance = balance;
    }

    public void setId(long id){
        this.id = id;
    }

    public long getId(){
        return id;
    }

    public void setCardNumber(String cardNumber){
        this.cardNumber = cardNumber;
    }

    public String getCardNumber(){
        return cardNumber;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return password;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }



}
