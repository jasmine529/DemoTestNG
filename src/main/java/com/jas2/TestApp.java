package com.jas2;

import org.testng.annotations.Test;

/**
 * Created by jasmine529 on 2018/10/18.
 */
public class TestApp {
    @Test(dependsOnGroups = {"deploy","db"})
    public void method1(){
        System.out.println("This is method 1");
    }
    @Test(dependsOnMethods = {"method1"})
    public void method2(){
        System.out.println("This is method 2");
    }
}
