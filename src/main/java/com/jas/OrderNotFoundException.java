package com.jas;

/**
 * Created by jasmine529 on 2018/10/17.
 */
public class OrderNotFoundException extends Exception {
    public OrderNotFoundException(){
        super();
    }
    public OrderNotFoundException(String message){
        super(message);
    }
}
