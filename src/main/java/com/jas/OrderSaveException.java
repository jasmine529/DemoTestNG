package com.jas;

import com.sun.xml.internal.ws.api.model.CheckedException;
import org.junit.rules.ExpectedException;

/**
 * Created by jasmine529 on 2018/10/17.
 */
public class OrderSaveException extends Exception {
    public OrderSaveException(){
        super();
    }
    public OrderSaveException(String message){
        super(message);
    }
}
