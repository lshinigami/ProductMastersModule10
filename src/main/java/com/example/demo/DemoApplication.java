package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;

public class DemoApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(DependencyInjectorConfig.class);

        //medium
        PaymentProcessor bitcoin = context.getBean("bitcoin", PaymentProcessor.class);
        bitcoin.processPayment(BigDecimal.valueOf(25));

        PaymentProcessor plovcoin = context.getBean("plovcoin", PaymentProcessor.class);
        plovcoin.processPayment(BigDecimal.valueOf(10));

        PaymentProcessor mastercard = context.getBean("mastercard", PaymentProcessor.class);
        mastercard.processPayment(BigDecimal.valueOf(30));

        //hard
        OrderService orderService = context.getBean(OrderService.class);
        orderService.makeOrder(BigDecimal.valueOf(15));

        OrderService orderServiceSecond = context.getBean(OrderService.class);
        orderServiceSecond.makeOrder(BigDecimal.valueOf(15));

        System.out.println(orderServiceSecond == orderService);
    }
}
