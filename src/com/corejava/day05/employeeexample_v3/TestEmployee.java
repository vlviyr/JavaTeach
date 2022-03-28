package com.corejava.day05.employeeexample_v3;

/**
 * 2022/02/13
 * 本程序为员工测试类
 */

public class TestEmployee {
    public static void main(String[] args){
//        Employee[] emps1 = {};
//        Employee[] emps2 = {};
//        Employee emp1 = new Employee("EM001", "张三", 9999, emps1);
//        Employee emp2 = new Employee("EM002", "李四", 8888, emps2);

        Employee emp1 = new Employee("EM001", "张三", 9999, new Employee[]{});
        Employee emp2 = new Employee("EM002", "李四", 8888, new Employee[]{});

        EmployeeService es = new EmployeeService();
        //将员工2添加到员工1的下属中
        es.addEmp(emp1, emp2);
        //显示员工1的下属
        es.showEmp(emp1);
        //显示员工1的下属的个数
        es.showEmpLen(emp1);
        //显示员工2的下属个数
        es.showEmpLen(emp2);

    }
}
