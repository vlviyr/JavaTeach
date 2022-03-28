package com.corejava.day04.phoneexample;


import com.corejava.day04.phoneexample.Phone;

/**
 * 本类用来测试Phone类
 *
 * @author ZY
 *
 */

public class TestPhone {
	public static void main(String[] args) {
		Phone applePhone = new Phone();
		applePhone.brand = "苹果手机";
		applePhone.price = 5999;
		applePhone.callPhone();
		applePhone.sentMessage();

		System.out.println("************");
		Phone matePhone = new Phone();
		matePhone.brand = "华为手机";
		matePhone.price = 4999;
		matePhone.callPhone();
		matePhone.sentMessage();


	}

}
