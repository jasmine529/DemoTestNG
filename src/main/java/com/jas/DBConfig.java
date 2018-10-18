package com.jas;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * Created by jasmine529 on 2018/10/17.
 */
public class DBConfig {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("@BeforeSuite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("@AfterSuite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("@BeforeTest");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("@AfterTest");
    }
}
