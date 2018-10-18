package com.jas;

import org.junit.rules.ExpectedException;
import org.testng.annotations.Test;

/**
 * Created by jasmine529 on 2018/10/17.
 */
public class TestRuntime {
    //ArithmeticException 出现异常的运算条件
    @Test(expectedExceptions = ArithmeticException.class)
    public void divisionWithException(){
        int i =1/0;
        System.out.println("After division the value of i is :" + i);
    }
}
