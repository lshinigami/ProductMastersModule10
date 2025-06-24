package com.example.demo.easy;

import org.springframework.stereotype.Service;

@Service
public class EnglishGreetingService implements GreetingService {
    @Override
    public void sayHello() {
        System.out.println("Hello");
    }
}
