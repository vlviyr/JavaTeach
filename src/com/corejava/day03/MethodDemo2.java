package com.corejava.day03;

import java.util.Date;

import com.corejava.util.DateUtil;

/*
 * 1、static的方法调用
 * 调用方式是：类名.方法名(...)
 * 如果调用的是本类中自己的方法，则类名可以省略
 * 如果不是同一包下的类，还需要导入包
 */

public class MethodDemo2 {
	public static void main(String[] args) {
		String time1 = DateUtil.formatDate(new Date());
		System.out.println(time1);

		String time2 = DateUtil.formatDate(new Date(), "yyyy:MM:dd");
		System.out.println(time2);

		Date date1 = DateUtil.parseDate(time1);
		System.out.println(date1);

		Date date2 = DateUtil.parseDate(time2, "yyyy:MM:dd");
		System.out.println(date2);

		Date date3 = DateUtil.createDate(1998, 12, 1);
		System.out.println(date3);

	}

}
