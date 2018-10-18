package com.jas;

import org.testng.annotations.Test;

/**
 * Created by jasmine529 on 2018/10/17.
 */
public class TestIgnore {
    @Test
    public void test1(){
        System.out.println("testng......test1");
    }
    @Test(enabled = false)
    public void test2(){
        System.out.println("testng......test2");
    }
    @Test
    public void test3(){
        System.out.println("testng......test3");
    }
}
