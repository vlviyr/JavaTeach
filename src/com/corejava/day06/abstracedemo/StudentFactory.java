package com.corejava.day06.abstracedemo;

public class StudentFactory {
    public static final int MYSQL = 1;
    public static final int ORACLE = 2;

    public static StudentService getservice(int type){
        StudentService service = null;
        if(type == 1){
            service = new MySql();
        }else if(type == 2){
            service = new Oracle();
        }else{
            System.out.println("输入参数有误！");
        }
        return service;
    }
}
