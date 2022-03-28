package com.corejava.day02;

/**
 * 本类用来演示Java格式化输出
 *
 * %d表示整数，%f表示浮点数，%s表示字符串
 *
 * %-10s表示该变量占用10个单位长度，-表示左对齐（默认右对齐）
 *
 * %.2f表示浮点数显示两位小数
 *
 * \n 表示换行
 *
 * \t 表示tab
 *
 * @author ZY
 *
 */

public class FormatePrint {
	public static void main(String[] args) {
		String name = "张三斤";
		int age = 15;
		double score = 98.3;
		System.out.println(age + "岁的" + name + "考了" + score + "分。");

		System.out.println("----------------------------------");
		System.out.printf("%d岁的%s张三斤考了%f分。\n", age, name, score);
		System.out.printf("%d岁的%s张三斤考了%.2f分。\n", age, name, score);
		System.out.printf("%d岁的%10s张三斤考了%f分。\n", age, name, score);
		System.out.printf("%d岁的%-10s张三斤考了%f分。", age, name, score);
	}

}