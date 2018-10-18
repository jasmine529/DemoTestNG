package com.jas3;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.sql.Connection;
import java.util.Properties;

/**
 * Created by jasmine529 on 2018/10/18.
 */
public class TestParameterXML {
    Connection con;
    @Test
    @Parameters({"dbconfig","poolsize"})
    public void createConnection(String dbconfig, int poolsize){

    }

    }
