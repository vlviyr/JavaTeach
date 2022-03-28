package com.corejava.day05.junit4demo;

import org.junit.Assert;
import org.junit.Test;

/**
 * 2022/02/14
 * 本类用来演示使用Junit4进行单元测试
 *
 * 一、传统测试方法main()方法测试
 *
 * 二、单元测试：第三方Junit4
 *
 * 1、断言测试
 *
 * 2、性能测试
 *
 * 3、预期异常测试
 *
 * 4、测试覆盖率
 *
 */

public class TestCalculatorDemo {

    //传统main()方法测试

    /*public static void main(String[] args){
        PlugDemo pd = new PlugDemo();
        System.out.println(pd.add(2, 4));

    }*/

    //单元测试
    @Test
    public void testAdd(){
        CalculatorDemo pd = new CalculatorDemo();
        int result = pd.add(2, 4);
        //断言
        Assert.assertEquals(6, result);
//        Assert.assertEquals(7, result);

    }

    //性能测试（该方法需要在1000毫秒内完成）
    @Test(timeout = 1000)
    public void testSub() throws InterruptedException {
        CalculatorDemo cd = new CalculatorDemo();
        int result = cd.sub(5, 2);
        Thread.sleep(500);
    }

    //预期异常测试
    @Test(expected = ArithmeticException.class)
    public void testDiv(){
        CalculatorDemo cd = new CalculatorDemo();
//        int result = cd.div(4, 2);
//        Assert.assertEquals(2, result);
        int result = cd.div(4, 0);
    }

    //覆盖率测试
    @Test
    public void testCover(){
        CalculatorDemo cd = new CalculatorDemo();
        cd.cover(1);
        cd.cover(2);
        cd.cover(3);
        cd.cover(4);
    }
}
