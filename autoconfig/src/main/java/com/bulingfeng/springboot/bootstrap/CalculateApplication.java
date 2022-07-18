package com.bulingfeng.springboot.bootstrap;

import com.bulingfeng.springboot.service.CalculateService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.bulingfeng.springboot.service")
public class CalculateApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext
                =new SpringApplicationBuilder(CalculateApplication.class)
                .profiles("java8")
                .web(WebApplicationType.NONE)
                .run(args);
        CalculateService java8 =
                applicationContext.getBean("java8CalculateImpl",CalculateService.class);

        System.out.println(java8.sum(1,2,3));
    }
}
