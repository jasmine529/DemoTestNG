package com.jas2;

import org.testng.annotations.Test;

/**
 * Created by jasmine529 on 2018/10/18.
 */
public class TestDatabase {
    @Test(groups="db",dependsOnGroups="deploy")
    public void initDB(){
        System.out.println("this is initDB()");
    }

    @Test(dependsOnMethods={"initDB"},groups="db")
    public void testConnection(){
        System.out.println("This is testConnection()");
    }

}
