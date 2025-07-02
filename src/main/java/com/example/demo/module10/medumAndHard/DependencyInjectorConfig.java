package com.example.demo.module10.medumAndHard;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class DependencyInjectorConfig {
    @Bean
    @Primary
    public PaymentProcessor paymentProcessor() {
        return new VisaCardPaymentProcessor();
    }

    @Bean(name = "mastercard")
    public PaymentProcessor masterCardProcessor() {
        return new MasterCardPaymentProcessor();
    }

    @Bean(name = "bitcoin")
    public PaymentProcessor bitcoinProcessor() {
        return new BitcoinPaymentProcessor();
    }

    @Bean(name = "plovcoin")
    public PaymentProcessor plovCoinProcessor() {
        return new PlovCoinPaymentProcessor();
    }


    @Bean
    @Scope(BeanDefinition.SCOPE_SINGLETON)
    public OrderService orderService() {
        return new OrderService();
    }
}
