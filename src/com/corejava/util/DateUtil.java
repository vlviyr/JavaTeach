package com.corejava.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 自定义一些项目用到的工具类
 *
 * @author ZY
 *
 */

//自定义的日期工具类
//拿到日期返回指定格式
public class DateUtil {

//	public static String formatDate(String pattern) {
//		Date date = new Date();
//		SimpleDateFormat sdfDateFormat = new SimpleDateFormat(pattern);
//		String timeStr =  sdfDateFormat.format(date);
//		return timeStr;
//	}

//	public static String formatDate(Date date, String pattern) {
//		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
//		String time = sdf.format(date);
//		return time;
//	}

	/*
	 * 方法重载
	 *
	 * 在DateUtil中提供了两个名为formatDate的方法， 两个方法方法名相同，但是参数不同，这种情况叫做方法的重载
	 *
	 *
	 * 前提：多个方法必须在同一个类中 要求：方法名必须相同，参数列表（参数类型、个数、顺序）或返回值不同
	 *
	 * 意义：可以简化方法定义的名字和个数，代码节俭优雅，对于设计者和使用者都会很方便
	 *
	 */



	/*
	 * 格式化日期
	 */
	public static String formatDate(Date date) {
		return new SimpleDateFormat("yyyy-MM-dd").format(date);
	}

	public static String formatDate(Date date, String pattern) {
		return new SimpleDateFormat(pattern).format(date);
	}


	/*
	 * 解析指定格式的日期
	 */
	public static Date parseDate(String time) {
		Date date = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			date = sdf.parse(time);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;

	}


	public static Date parseDate(String time, String pattern) {
		Date date = null;
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		try {
			date = sdf.parse(time);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}


	//根据指定的年月日创建日期
	public static Date createDate(int year, int month, int day) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month - 1, day);
		return calendar.getTime();

	}

}
