package com.example.demo;

import java.math.BigDecimal;

public class MasterCardPaymentProcessor implements PaymentProcessor{
    @Override
    public void processPayment(BigDecimal amount) {
        System.out.println("Payment via MAsterCard: " + amount);
    }
}
