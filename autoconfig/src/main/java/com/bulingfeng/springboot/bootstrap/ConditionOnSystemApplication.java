package com.bulingfeng.springboot.bootstrap;

import com.bulingfeng.springboot.condition.ConditionOnSystemProperty;
import com.bulingfeng.springboot.service.CalculateService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * 使用编程的方式来实现条件装配
 * 只有当返回的结果为true的时候才会装配
 */

public class ConditionOnSystemApplication {

    @Bean
    @ConditionOnSystemProperty(name = "user.name",value = "41395") // 41395是我计算机名称
    public String helloWorld(){
        return "hello world";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext
                =new SpringApplicationBuilder(ConditionOnSystemApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        String helloWorld = applicationContext.getBean("helloWorld", String.class);
        System.out.println(helloWorld);
    }
}
