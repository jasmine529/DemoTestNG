package com.jas3;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * Created by jasmine529 on 2018/10/18.
 */
public class TestParameterDateProvider3 {
    @Test(dataProvider="dataProvider")
    public void test1(int number,int expected){
        Assert.assertEquals(number,expected);
    }

    @Test(dataProvider="dataProvider")
    public void test2(String email,String expected){
        Assert.assertEquals(email,expected);
    }

    @DataProvider(name="dataProvider")
    public Object[][] provideData(Method method) {
        Object[][] result = null;
        if(method.getName().equals("test1")){
            result = new Object[][]{
                    {1,1},{200,200}
            };
        }
        if(method.getName().equals("test2")){
            result = new Object[][]{
                    {"test@gmail.com","test@gmail.com"},
                    {"test@163.com","test@163.com"}
            };
        }
        return result;
    }
}
