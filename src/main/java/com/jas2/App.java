package com.jas2;

import org.testng.annotations.Test;

/**
 * Created by jasmine529 on 2018/10/18.
 */
public class App {
    @Test
    public void method1(){
        System.out.println("this is method 1");
        throw new RuntimeException();
    }
    @Test(dependsOnMethods = {"method1"})
    public void method2(){
        System.out.println("this is method 2");
    }
}
