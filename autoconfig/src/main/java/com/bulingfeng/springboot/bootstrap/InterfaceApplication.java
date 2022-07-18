package com.bulingfeng.springboot.bootstrap;

import com.bulingfeng.springboot.annotation.EnableHelloWorld;
import com.bulingfeng.springboot.config.HelloWorldConfig;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@EnableHelloWorld
public class InterfaceApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext=new SpringApplicationBuilder(InterfaceApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        // 验证HelloWorldConfig是否注入成功
        HelloWorldConfig helloWorldConfig =
                applicationContext.getBean(HelloWorldConfig.class);
        System.out.println("HelloWorldConfig:"+ helloWorldConfig);
        // 进行查找对应的bean
        String beanName = applicationContext.getBean("beanName", String.class);
        System.out.println("bean:"+beanName);


        // 关闭上下文
        applicationContext.close();
    }
}
