package com.corejava.day04;

/**
 * 本类用来演示continue的使用
 * 演示main（）函数动态传入参数的方式
 * 演示JVM传入参数的方式
 */

import java.util.Arrays;

public class Qusetion2 {
	public static void main(String[] args) {
		int i=1, j = 10;
		do {
			if(i++>--j) {
				continue;
			}
		}while(i<5);
		System.out.println("i=" + i + " and j =" + j);

		int count_a = 0;
		int a = 0;
		while(a<2) {
			a = a+1;
			count_a++;
			if(a==2) {
				continue;
			}
		}
		System.out.println("a:" + a + " count_a:" + count_a);
		//continue只是针对循环体，而对于并不跳过判断
		int count_b = 0;
		int b = 0;
		do {
			b = b+1;
			count_b++;
			if(b == 2) {
				continue;
			}
		}while(b<2);
		System.out.println("b:" + b + " count_b:" + count_b);


		//问题，如果for循环内与外部有关系，那为什么在for循环之后无法使用变量i，如果for循环内与外部无关系，为什么无法在循环内新建一个int i;
//		for(int i=0; i< 4; i++) {
//			System.out.println(i);
//		}
//		System.out.println(i);

		//在Run ——》 Run Configuration ——》Argument中写入main类参数(Program arguments)
		System.out.println(Arrays.toString(args));
		System.out.println(args[0]);
		//

		//在Run ——》 Run Configuration ——》Argument中写入虚拟机参数(VM arguments)
		//参数 -verbose:class 参数用来显示虚拟机加载的类
	}

}
