package com.example.demo.module10.easy;

import org.springframework.beans.factory.annotation.Autowired;

public class Noname {
    private final GreetingService greetingProcessor;

    @Autowired
    public Noname(GreetingService greetingProcessor){
        this.greetingProcessor = greetingProcessor;
    }

    public GreetingService getGreetingProcessor() {
        return greetingProcessor;
    }
}
