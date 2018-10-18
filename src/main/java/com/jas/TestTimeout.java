package com.jas;

import org.testng.annotations.Test;

/**
 * Created by jasmine529 on 2018/10/17.
 */
//超时可用于性能测试，以确保方法在合理的时间内返回
public class TestTimeout {
    @Test(timeOut = 5000)
    public void testThisShouldPass() throws InterruptedException{
        Thread.sleep(4000);
    }

    @Test(timeOut = 1000)
    public void testThisShouldFail(){
        while (true){

        }
    }
}
