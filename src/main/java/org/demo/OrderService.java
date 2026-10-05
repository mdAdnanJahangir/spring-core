package org.demo;


import org.demo.payments.PaymentServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    @Autowired
    private PaymentServise payment ;

//
//    public OrderService(PaymentServise payment) {
//        this.payment = payment;
//    }

//    @Autowired
//    public void setPayment(PaymentServise payment) {
//        this.payment = payment;
//    }

    void placeorder(){


        payment.pay();

        System.out.println(" order placed ");
    }
}


