package com.corejava.day03.exercise;

import java.util.Scanner;

public class TestCalc {

	//属性
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean isError = false;
		for(;;) {
			//打印主界面
			menu();

			//用户选择功能
			double choice = getInput("输入选择的功能:");

			double result = 0.0;
			//对用户的选择进行判断
			if (choice == 1) {
				result = sqrt(getInput("请输入被开放数："));
			} else if (choice == 2) {
				result = pow(getInput("输入一个底数："), getInput("输入一个指数:"));
			} else if (choice == 3) {
				result = max(getInput("输入第一个数："), getInput("输入第二个数:"));
			} else if (choice == 4) {
				result = min(getInput("输入第一个数："), getInput("输入第二个数："));
			} else if (choice == 5) {
				System.out.println("再见！");
				break;
			} else {
				isError = true;
				System.err.println("输入有误！");
			}
			if(!isError) {
				System.out.println("计算结果是：" + result);
			}
		}
	}


	/**
	 * 输出程序主界面的方法
	 */
	public static void menu() {
		System.out.println("======计算器======");
		System.out.println("1.平方根");
		System.out.println("2.幂运算");
		System.out.println("3.最大值");
		System.out.println("4.最小值");
		System.out.println("5.退出");
	}

	/**
	 * 用户键盘输入的方法
	 */
	public static double getInput(String message) {
		System.out.println(message);
		return scanner.nextDouble();
	}

	/**
	 * 计算平方根方法
	 * @param a
	 * @return
	 */

	public static double sqrt(double a) {
		System.out.println("开始计算平方根...");
		return Math.sqrt(a);
	}

	/**
	 * 计算幂方法
	 * @param a
	 * @param b
	 * @return
	 */
	public static double pow(double a, double b) {
		System.out.println("开始计算幂...");
		return Math.pow(a, b);
	}

	/**
	 * 计算最大值的方法
	 * @param a
	 * @param b
	 * @return
	 */
	public static double max(double a, double b) {
		System.out.println("开始计算最大值...");
		return Math.max(a, b);
	}

	/**
	 * 计算最小值的方法
	 * @param a
	 * @param b
	 * @return
	 */
	public static double min(double a, double b) {
		System.out.println("开始计算最小值...");
		return Math.min(a, b);
	}
}
