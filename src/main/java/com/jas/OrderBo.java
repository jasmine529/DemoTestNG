package com.jas;

/**
 * Created by jasmine529 on 2018/10/17.
 */
public class OrderBo {
    public void save(Order order) throws OrderSaveException{
        if (order == null){
            throw new OrderSaveException("Order is empty");
        }
    }

    public void update(Order order) throws OrderUpdateException,OrderNotFoundException{
        if (order == null){
            throw new OrderUpdateException("Order is Empty");
        }
        throw new OrderNotFoundException();
    }
}
