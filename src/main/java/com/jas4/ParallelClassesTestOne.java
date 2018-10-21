package com.jas4;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by jasmine529 on 2018/10/21.
 */
public class ParallelClassesTestOne {
    @BeforeClass
    public void beforeClass(){
        long id = Thread.currentThread().getId();
        System.out.println("before test-class. Thread id is: "+id);
    }
    @Test
    public void testMethodOne(){
        long id = Thread.currentThread().getId();
        System.out.println("Sample test-Method One. Thread id is: "+id);
    }
    @Test
    public void testMethodTwo(){
        long id = Thread.currentThread().getId();
        System.out.println("Sample test-Method Two. Thread id is: "+id);
    }
    @Test
    public void afterClass(){
        long id = Thread.currentThread().getId();
        System.out.println("After test-class. Thread id is: "+id);
    }




}
