package com.corejava.day09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 2022-03-27
 * 本类用来演示正则表达式
 *
 * 模糊匹配：
 * find()   进行模糊匹配正则，且该方法操作的是匹配器的游标，操作不可逆
 * group()  把匹配到的内容打包字符串
 * start()  匹配到的内容的起始下标
 * end()    匹配到的内容的结束下标
 *
 */
public class RegexDemo {
    public static void main(String[] args){
        System.out.println("ab$c.java".matches("^[^0-9][a-zA-Z0-9_\\$]*\\.java$"));

        //正则表达式API
        //1. 创建正则表达式模板对象
        Pattern p = Pattern.compile("[a-zA-Z]+");
        //2. 创建匹配器对象
        Matcher m = p.matcher("我会Java编程，也会Python编程，还懂一些C，但是我最喜欢Ruby。");
        //3. 精确匹配（一般不使用，直接使用matches即可）
        System.out.println(m.matches());
        //4. 模糊匹配
        int count = 0;
        while (m.find()){
            count++;
            System.out.println(m.group() + "在目标的" + m.start() + "-" + m.end() + "之间。");
        }
        System.out.println("目标数据在内容中重复了：" + count + "次。");


    }
}
