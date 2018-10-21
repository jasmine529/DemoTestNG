package com.jas4;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by jasmine529 on 2018/10/19.
 */
public class ParalleMethodTest {
    @BeforeMethod
    public void beforeMethod(){
        long id = Thread.currentThread().getId();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e)
        {
            System.out.println(e.getStackTrace());
        }
        System.out.println("Before test-method. Thread id is: " + id);
    }
    @Test
    public void testMethodsOne(){
        long id = Thread.currentThread().getId();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e)
        {
            System.out.println(e.getStackTrace());
        }
        System.out.println("Simple test-method One. Thread id is: " + id);
    }
    @Test
    public void testMethodsTwo(){
        long id = Thread.currentThread().getId();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e)
        {
            System.out.println(e.getStackTrace());
        }
        System.out.println("Simple test-method Two. Thread id is: " + id);
    }
    @AfterMethod
    public void afterMethods(){
        long id = Thread.currentThread().getId();
        System.out.println("After test-method. Thread id is: " + id);
    }
}
