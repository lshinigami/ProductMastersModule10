package com.example.demo.module10.medumAndHard;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class VisaCardPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(BigDecimal amount) {
        System.out.println("Payment via VISA: " + amount);
    }
}
