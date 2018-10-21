package com.jas4;

import org.testng.annotations.Test;

/**
 * Created by jasmine529 on 2018/10/21.
 */
public class ParalleMtest {
    @Test(invocationCount = 5, threadPoolSize = 5)
    public void smallThreadPool(){
        System.out.println("Current Thread is "+ Thread.currentThread().getId());
    }
}
