package com.example.demo;

import java.math.BigDecimal;

public interface PaymentProcessor {
    void processPayment(BigDecimal amount);
}
