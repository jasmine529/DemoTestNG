package com.jas;

import org.junit.rules.ExpectedException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by jasmine529 on 2018/10/17.
 */
public class TestCheckedException {

    OrderBo orderBo;
    Order data;

    @BeforeTest
    void setup(){
        orderBo = new OrderBo();
        data = new Order();
        data.setId(1000);
        data.setCreatedBy("maxsu");
    }

    @Test(expectedExceptions = OrderSaveException.class )
    public void throwIfOrderIsNull() throws OrderSaveException{
        orderBo.save(null);
    }

    @Test(expectedExceptions = {OrderUpdateException.class, OrderNotFoundException.class})
    public void throwIfOrderIsNotExists() throws OrderUpdateException,OrderNotFoundException{
        orderBo.update(data);
    }

}
