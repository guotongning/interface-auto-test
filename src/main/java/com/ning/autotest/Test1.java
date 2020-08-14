package com.ning.autotest;

import com.ning.javabase.Main;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @Author: nicholas
 * @Date: 2020/8/13 21:50
 * @Descreption: 第一课：Junit的使用。
 */
public class Test1 {
    @Before
    public void pre(){
        System.out.println("之前");
    }
    @After
    public void aft(){
        System.out.println("之后");
    }
    @Test
    public void test(){
        System.out.println("当中");
    }
    @Test
    public void test1(){
        System.out.println("当中1");
    }
    @Test
    public void testAdd(){
        System.out.println(new Main().add(1,1));
    }
    @Test
    public void testDiv(){
        System.out.println(new Main().div(2,2));
    }
    @Test
    public void testSub(){
        System.out.println(new Main().sub(3,2));
    }
    @Test
    public void testMul(){
        System.out.println(new Main().mul(3,2));
    }
    @Test
    public void testA(){
        System.out.println(new Main().A());
    }
    @Test
    public void testB(){
        System.out.println(new Main().B("123"));
    }
}
