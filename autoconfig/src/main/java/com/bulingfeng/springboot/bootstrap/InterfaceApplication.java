package com.bulingfeng.springboot.bootstrap;

import com.bulingfeng.springboot.annotation.EnableHelloWorld;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@EnableHelloWorld
public class InterfaceApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext=new SpringApplicationBuilder(InterfaceApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        // 进行查找对应的bean
        String beanName = applicationContext.getBean("beanName", String.class);
        System.out.println("bean:"+beanName);

        // 关闭上下文
        applicationContext.close();
    }
}
