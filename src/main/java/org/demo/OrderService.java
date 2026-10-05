package org.demo;


import org.demo.payments.PaymentServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//@Scope("prototype")
@Component
public class OrderService {
//    @Autowired
//    private PaymentServise payment ;

//
//    public OrderService(PaymentServise payment) {
//        this.payment = payment;
//    }

//    @Autowired
//    public void setPayment(PaymentServise payment) {
//        this.payment = payment;
//    }

    OrderService(){
        System.out.println("object created ");
    }

    void placeorder(){


       // payment.pay();

        System.out.println(" order placed ");
    }
}


