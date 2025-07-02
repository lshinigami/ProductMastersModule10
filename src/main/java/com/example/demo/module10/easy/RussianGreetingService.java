package com.example.demo.module10.easy;

import org.springframework.stereotype.Service;

@Service
public class RussianGreetingService implements GreetingService {
    @Override
    public void sayHello() {
        System.out.println("Привет");
    }
}
