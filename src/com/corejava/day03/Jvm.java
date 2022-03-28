package com.corejava.day03;

import java.util.Arrays;

/**
 * 本类用来演示JVM内存结构
 * 开发者无需关注的JVM内存结构（划分为五个结构，本质上都是内存空间）
 * 1.寄存器
 * 2.本地方法栈（寄存器在使用操作功能时候使用）
 *
 * 开发者需要关注的JVM内存结构
 * 3.方法区		用来存储字节码文件
 * 4.堆			用来存放对象		特点：游离状态，不方便查找
 * 5.栈			用来存放变量		特点：先进后出，固定有序（类似于弹夹），方便查找
 * @author ZY
 *
 */

public class Jvm {
	public static void main(String[] args) {
		/**
		 * 基本类型--栈中保存
		 */
		int i=3;

		/**
		 * int[] arr = {1, 2, 3}
		 * System.out.println(arr);
		 * 对象类型--变量（引用）存在栈中，实际对象存在堆中
		 * {1, 2, 3}数组对象保存在内存堆中
		 * arr变量保存在栈中
		 * arr变量中保存的是对象{1, 2, 3}在堆中的内存地址。
		 */

		//1. 创建一个元素为{1, 2, 3}的对象类型数组存放在堆空间中，该空间对应的内存地址保存在arr1变量中（引用），变量保存在栈中
		int[] arr1 = {1, 2, 3};
		//2. 创建一个元素为{4, 5, 6}的对象类型数组存放在堆空间中，该空间对应的内存地址保存在arr2变量中（引用），变量保存在栈中
		int[] arr2 = {4, 5, 6};
		//3. 把arr2中保存的地址赋值给arr，arr原理存储的内存地址被覆盖，即arr1和arr2中存放了相同的内存地址，同时指向了arr2
		//4. 此时，堆空间中的{1, 2, 3}数组对象，没有任何的引用所指向，即不能被访问，成为垃圾对象。
		//Java有自动垃圾回收机制（GC）来回收垃圾对象，不需要程序员来人为关注
		arr1 = arr2;
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		//结论：一个Java对象在同一个时间可以被多个引用所指向，一个变量（引用）在同一时间只能指向一个对象。

		//作用：提示和呼叫JVM来回收垃圾对象，注意，调用该方法也不一定立刻回收垃圾
		System.out.println("提示回收垃圾");
		//System.gc()
		//Runtime.getRuntime().gc();




		/**
		 * 基本类型，值传递
		 * 调用时，把传入的参数拷贝一份发送给方法参数列表，对副本进行修改，原本不变
		 */
		System.out.println("*****基本类型参数传递********");
		int num = 2;
		int result = baseType(num);
		System.out.println(num);
		System.out.println(result);

		/**
		 * 对象类型，引用传递
		 * 调用时，把对象的内存地址拷贝一份发送给方法的参数列表，
		 * 两个引用【实参（具有真正值的数组对象），形参（方法参数列表）】，同时使用同一个对象，
		 * 通过其中的任何一个引用修改了对象，则另一个引用访问时也会发生相应的变化。
		 */

		System.out.println("*********对象类型的参数传递********");
		int[] array = {1, 2, 3};
		int[] newArray =  objectType(array);
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(newArray));



	}

	public static int baseType(int num) {
		return num +=1;

	}

	public static int[] objectType(int[] array) {
		for(int i = 0; i< array.length;i++) {
			array[i] += 1;
		}
		return array;
	}



}
