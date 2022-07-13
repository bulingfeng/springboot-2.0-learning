package com.bulingfeng.springboot;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * 1. 在启动类上使用@Enablexxx这类注释可以加载你想要激活的bean
 * 2. 也可以使用@ComponentScan注解来扫描对应的包，包内部使用@Enablexxx，从而把
 * 对应想要激活的bean放入到容器中
 */
//@EnableHelloWorld
@ComponentScan("com.bulingfeng.springboot.mock")
public class IocMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext=new SpringApplicationBuilder(IocMain.class)
                .web(WebApplicationType.NONE)
                .run(args);

        // 进行查找对应的bean
        String beanName = applicationContext.getBean("beanName", String.class);
        System.out.println("bean:"+beanName);

        // 关闭上下文
        applicationContext.close();
    }
}