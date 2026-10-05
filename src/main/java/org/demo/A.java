package org.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.ls.LSOutput;

@Component
public class A {

    OrderService order;


    @Autowired
    A(OrderService order ){
        this.order = order;
        System.out.println("in a ");
    }


}
