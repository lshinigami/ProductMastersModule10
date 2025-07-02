package com.example.demo.module10.medumAndHard;

import java.math.BigDecimal;

public class MasterCardPaymentProcessor implements PaymentProcessor{
    @Override
    public void processPayment(BigDecimal amount) {
        System.out.println("Payment via MAsterCard: " + amount);
    }
}
