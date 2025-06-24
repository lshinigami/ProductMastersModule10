package com.example.demo.easy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Noname noname = context.getBean(Noname.class);
        noname.getGreetingProcessor().sayHello();
    }
}
