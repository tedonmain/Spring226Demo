package com.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class GreeterConfiguration {

    @Bean
    @Scope(value = "prototype")
    public Greeter greeter() {
        return new Greeter();
    }

    @Bean
    @Scope(value = "singleton")
    public FriendlyGreeter friendlyGreeter() {
        return new FriendlyGreeter();
    }

}
