package com.corejava.day09;

import com.corejava.day05.junit4demo.CalculatorDemo;

/**
 * 2022-03-27
 * 本类用来演示包装类Character
 */

public class CharacterDemo {
    public static void main(String[] args){
        Character c1 = 'a';

        //1. 判断是否是数字
        System.out.println("c1:" + Character.isDigit(c1));

        //2. 判断是否是字母
        System.out.println("c1:" + Character.isLetter(c1));
        Character c2 = '我';
        System.out.println("c2:" + Character.isLetter(c2));
        //3. 判断是否是空白
        System.out.println("空白：" + Character.isWhitespace(' '));

        //4. 判断字母大小写
        System.out.println("大写字母：" + Character.isUpperCase('A'));
        System.out.println("小写字母：" + Character.isLowerCase('a'));

        //5. 转换大小写
        char r1 = Character.toLowerCase('A');
        char r2 = Character.toUpperCase('a');
        System.out.println("" + r1 + r2);
    }
}
