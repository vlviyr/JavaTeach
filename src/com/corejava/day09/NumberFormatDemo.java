package com.corejava.day09;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * 2022-03-27
 * 本类用来演示数字的格式化类，java.text.NumberFormat
 */
public class NumberFormatDemo {
    public static void main(String[] args){
        double d = 123456789.987654321;

        //1.1 获取当前系统指定的数值格式:xxx,xxx,xxx.xxx
        NumberFormat nf = NumberFormat.getInstance();
        String r1 = nf.format(d);
        System.out.println(r1);

        //1.2 格式化对象-设置小数部分所允许的最小位数
        nf.setMinimumFractionDigits(15);
        System.out.println(nf.format(d));

        //1.3 格式化对象-设置整数部分所允许的最小位数
        nf.setMinimumIntegerDigits(15);
        System.out.println(nf.format(d));

        //1.4 格式化对象-设置小部分所允许的最大位数（小数位多于设置值的情况下会丢失精度)
        nf.setMaximumFractionDigits(5);
        System.out.println(nf.format(d));

        //1.5 格式化对象-设置整数部分所允许的最大位数(整数位多于设置值的情况下会有误差）
        nf.setMaximumIntegerDigits(5);
        System.out.println(nf.format(d));



        //2. 获取当前系统指定的货币格式
        NumberFormat nf1  = NumberFormat.getCurrencyInstance();
        String r2 = nf1.format(d);
        System.out.println(r2);

        //3. 获取指定区域的货币格式
        NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.US);
        String r3 = nf2.format(d);
        System.out.println(r3);
        //4.



    }
}
