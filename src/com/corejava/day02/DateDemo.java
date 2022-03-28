package com.corejava.day02;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateDemo {

	public static void main(String[] args) {
		//获取当前系统时间(默认输出格式)
		Date timeStr1 = new Date();
		System.out.println("当前系统时间:" + timeStr1);

		//使用日期格式化类来设置日期格式
		//日期模板,y年,M月,d日,H24小时制,h12小时制,m分钟,s秒,E星期
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm:ss E");
		String timeStr2 = sdf.format(timeStr1);
		System.out.println(timeStr2);

		//获取当前时间毫秒数
		
		
	}

}