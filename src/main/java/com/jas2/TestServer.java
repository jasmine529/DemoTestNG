package com.jas2;

import org.testng.annotations.Test;

/**
 * Created by jasmine529 on 2018/10/18.
 */
@Test(groups = "deploy")
public class TestServer {
    @Test
    public void deployServer(){
        System.out.println("Deploying Server ...");
    }

    @Test(dependsOnMethods = "deployServer")
    public void deployBackUpServer(){
        System.out.println("Deploying Backup Server(depends on deplouServer)");
    }
}