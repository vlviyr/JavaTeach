package com.corejava.day06.abstracedemo;

import org.junit.Test;

/**
 * 2022/02/18
 * 本类为测试类
 * 用来演示抽象类和抽象方法
 */

public class TestStudent {
    @Test
    public void testMySql(){
        MySql mysql = new MySql();
        mysql.insertStudent();
        mysql.deleteStudent();
        mysql.updateStudent();
        mysql.selectStudents();
    }

    @Test
    public void testOracle(){
        Oracle oracle = new Oracle();
        oracle.insertStudent();
        oracle.deleteStudent();
        oracle.updateStudent();
        oracle.selectStudents();
    }

    @Test
    public void testService(){
        StudentService service = StudentFactory.getservice(2);

        service.insertStudent();
        service.deleteStudent();
        service.selectStudents();
        service.updateStudent();
    }

    @Test
    public void testService2(){
        StudentService service = StudentFactory.getservice(1);

        service.insertStudent();
        service.deleteStudent();
        service.selectStudents();
        service.updateStudent();
    }


}
