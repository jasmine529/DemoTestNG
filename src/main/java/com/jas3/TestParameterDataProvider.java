package com.jas3;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by jasmine529 on 2018/10/18.
 */
public class TestParameterDataProvider {
    @Test(dataProvider="provideNumbers")
    public void test(int number,int expected){
        Assert.assertEquals(number+10,expected);
    }

    @DataProvider(name="provideNumbers")
    public Object[][] provideData(){
        return new Object[][]{{10,20},{100,110},{200,210}};
    }
}
