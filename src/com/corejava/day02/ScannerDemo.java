package com.corejava.day02;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		//1.创建Scanner对象,
		Scanner scanner = new Scanner(System.in);
		//2.导入Scanner类
		//3.调用Scanner对象的方法,实现键盘输入获取

		//获取整数
		System.out.println("输入一个整数:");
		int nextInt = scanner.nextInt();
		System.out.println("获取到的数据:" + nextInt);

		//获取浮点数
		System.out.println("输入一个浮点数:");
		double nextDouble = scanner.nextDouble();
		System.out.println("获取到输入的数字:" + nextDouble);

		//获取字符串输入
		System.out.println("输入一个字符串1:");
		String next = scanner.next();
		System.out.println("获取到无换行符字符串:" + next);
		//吸收确认输入时的换行符
		String testline = scanner.nextLine();
		System.out.print(testline);
		System.out.println("输入一个字符串2:");
		String nextline = scanner.nextLine();
		System.out.println("获取到的字符串" + nextline);
		System.out.println("Hello World!");
		scanner.close();

	}

}
