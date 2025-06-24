package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class OrderService {
    @Autowired
    //@Qualifier("mastercard")
    //@Qualifier("plovcoin")
    @Qualifier("bitcoin")
    private PaymentProcessor paymentProcessor;

    public OrderService() {

        System.out.println("OrderService have been created" + this);
    }

    public void makeOrder(BigDecimal amount) {
        paymentProcessor.processPayment(amount);
    }
}
