package com.corejava.day02;

import java.util.Scanner;

public class StringScannerDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//输入2w 3r，输出2w 3r
		String nextline1 = scanner.nextLine();
		System.out.println(nextline1);
		//输入2w 3r，输出2w
		String next1 = scanner.next();
		System.out.println(next1);

		String next2 = scanner.next();
		System.out.print(next2);

		String nextline2 = scanner.nextLine();
		System.out.print(nextline2);
		String next3 = scanner.next();
		String next4 = next3 + "string";
		System.out.print(next4);
		scanner.close();

	}

}