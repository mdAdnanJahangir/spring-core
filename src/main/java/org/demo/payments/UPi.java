package org.demo.payments;


import org.springframework.stereotype.Component;

@Component
public class UPi implements PaymentServise{
    @Override
    public void pay() {
        System.out.println(" upi ");

    }
}
