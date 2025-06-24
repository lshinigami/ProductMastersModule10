package com.example.demo.easy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {
    @Bean
    public Noname noname(GreetingService greetingProcessor){
        return new Noname(greetingProcessor);
    }
    @Bean
    @Primary
    public EnglishGreetingService englishGreetingService() {
        return new EnglishGreetingService();
    }

    @Bean
    public RussianGreetingService russianGreetingService() {
        return new RussianGreetingService();
    }
}
