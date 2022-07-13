package com.bulingfeng.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class HelloWorldConfig {

    @Bean
    public String beanName(){
        return "spring-boot-2.0";
    }
}
