package com.bulingfeng.springboot.bootstrap;

import com.bulingfeng.springboot.config.HelloWorldAutoConfig;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 自定义自动装配
 */
@EnableAutoConfiguration
public class EnableAutoConfigManualApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext
                =new SpringApplicationBuilder(EnableAutoConfigManualApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        String beanName = applicationContext.getBean("beanName", String.class);
        System.out.println("beanName:"+beanName);

        // 这里来检验 是否自动装配成功
        HelloWorldAutoConfig config = applicationContext.getBean(HelloWorldAutoConfig.class);
        System.out.println(config);
    }
}
