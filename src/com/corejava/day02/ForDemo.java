package com.corejava.day02;

public class ForDemo {
	public static void main(String[] args) {
		/**
		 *
		 * Part1:初始值[有且仅执行一次] Part2:循环条件（boolean）[最少执行一次] Part3:变量因子[可能执行可能不执行]
		 *
		 * 三个部分都可以单独省略或者全部省略
		 */
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		System.out.println("==============================");
		// 反向 for循环
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}

		System.out.println("==============================");

		// 嵌套for循环
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println(i + ":" + j);
			}
		}

		System.out.println("==============================");

		// 内外关联for循环
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.println(i + "," + j);
			}
		}

		//复合for循环
		for (int i = 1, j = 1; i <= 5 && j <= 10; i++, j += 2) {
			System.out.println(i + ":" + j);
		}

		// 增强for循环
		System.out.println("增强for循环");
		int[] array = { 1, 2, 3 };
		for (int i : array) {
			System.out.println(i);
		}
		System.out.println("******************");
	}

}
