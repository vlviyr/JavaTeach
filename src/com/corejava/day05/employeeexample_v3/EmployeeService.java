package com.corejava.day05.employeeexample_v3;

import java.util.Arrays;

/**
 * 2022/02/13
 * 本程序为员工业务类
 */

public class EmployeeService {
    //添加下属的方法(将员工emp2添加到员工emp1的下属数组中)
    public void addEmp(Employee emp1, Employee emp2){
        Employee[] emp = Arrays.copyOf(emp1.getEmployees(), emp1.getEmployees().length + 1);
        emp[emp.length - 1] = emp2;
        emp1.setEmployees(emp);
    }

    //输出员工下属的方法
    public void showEmp(Employee emp){
        Employee[] emps = emp.getEmployees();
//        for(int i = 0; i < emps.length; i++){
//            System.out.printf("员工编号：%s 员工姓名：%s 员工薪资：%f", emps[i].getNumber(), emps[i].getName(), emps[i].getSalary());
//        }
        //增强for循环
        for (Employee employee : emps) {
            System.out.printf("员工编号：%s 员工姓名：%s 员工薪资：%.2f\n", employee.getNumber(), employee.getName(), employee.getSalary());
        }
    }

    //获取员工下属的人数
    public void showEmpLen(Employee emp){
        System.out.printf("员工%s有%d个下属。\n", emp.getName(), emp.getEmployees().length);
    }
}
