package com.corejava.day04.phoneexample;

public class Phone {
	String brand;
	int price;

	public void callPhone() {
		System.out.printf("价格为%d的%s手机正在打电话\n", price, brand);

	}

	public void sentMessage() {
		System.out.printf("价格为%d的%s手机正在发短信\n", price, brand);
	}

}
