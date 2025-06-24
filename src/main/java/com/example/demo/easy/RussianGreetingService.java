package com.example.demo.easy;

import org.springframework.stereotype.Service;

@Service
public class RussianGreetingService implements GreetingService {
    @Override
    public void sayHello() {
        System.out.println("Привет");
    }
}
