package com.corejava.day03;

import java.util.Date;

/**
 * 本类用来演示Java方法定义
 *
 * 方法语法定义 修饰符 例如：main方法中的public、static
 *
 * 返回类型 例如：main方法中的void(表示返回空，没有返回值）没有返回值可以不写return语句
 * 任意数据类型：表示调用这个方法后得到执行的数据类型，此时方法必须有return语句
 *
 * 方法名 main就是方法名，命名规则，首字母小写，后面的每个单词首字母大写
 *
 * 参数列表 括号中的内容，例如(String[] args)
 *
 * 方法体 代码片段
 *
 * @author ZY
 *
 */

public class MethodDemo {
	public static void main(String[] args) {
		helloWorld();
		helloWorld();

		int x = add(2, 4);
		System.out.println(x);

		int y = getMaxNumber(2, 3);
		System.out.println(y);

	}

	public static void helloWorld() {
		System.out.println("Hello World!");
	}

	//定义一个整数加法
	public static int add(int a, int b) {
		return a + b;
	}

	//工作满5年的员工薪资提高10%
	public static void setSalary(Date hiredate) {

	}

	public static int getMaxNumber(int... numbers) {
		return 0;

	}


	//模拟方法定义
	//根据id查询数据库员工表中的员工
	public static Employee selectEmployeeById(int id) {
		return null;
	}


}

//模拟员工类
class Employee{

}
