package com.ning.autotest;

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

}
