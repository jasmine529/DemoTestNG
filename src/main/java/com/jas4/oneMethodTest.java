package com.jas4;

import org.testng.annotations.BeforeMethod;

import java.text.SimpleDateFormat;

/**
 * Created by jasmine529 on 2018/10/19.
 */
public class oneMethodTest {
    private SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    @BeforeMethod
    public void beforeClass(){
        System.out.println("Current Thread Id: " + Thread.currentThread().getId()+". Dataprovider number");
    }
}
