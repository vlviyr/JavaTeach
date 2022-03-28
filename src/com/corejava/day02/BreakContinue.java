package com.corejava.day02;

/**
 * 本类用来演示关键字break和continue
 *
 * 0、System.exit(0); 终止JVM进程，关闭虚拟机
 *
 * 1、break，打断 使用场景：循环或者switch
 *
 * 2、continue，只能用于循环 跳过本轮循环，继续执行下面的内容
 *
 * @author ZY
 *
 */

public class BreakContinue {
	public static void main(String[] args) {
		// break打断for循环
		for (int a = 1; a < 8; a++) {
			System.out.println(a);
			if (a == 4) {
				break;
			}
		}

		// break一次性打断多层循环
		boolean isOver = true;
		for (int i = 1; i < 8 && isOver; i++) {
			for (int j = 0; j < 8; j += 2) {
				System.out.println(i + ":" + j);
				if (j == 4) {
					isOver = false;
					break;
				}
			}
		}

		// continue用于循环
		for (int x = 1; x < 10; x++) {
			System.out.println(x);
			if (x == 3) {
				continue;
			}
		}

	}

}
