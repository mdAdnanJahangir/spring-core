package org.demo.payments;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Card implements PaymentServise {

    @Override
    public void pay() {
        System.out.println("  through card");
    }
}
