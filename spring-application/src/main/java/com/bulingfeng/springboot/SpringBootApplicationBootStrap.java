package com.bulingfeng.springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SpringBootApplicationBootStrap {
    public static void main(String[] args) {
        // 第一种启动web的形式
//        SpringApplication.run(SpringBootApplicationBootStrap.class,args);

        // 第二章启动web的形式
        Set<String> sources=new HashSet<>();
        sources.add(SpringBootApplicationBootStrap.class.getName());
        SpringApplication application=new SpringApplication();
        // 只要把含有@SpringBootApplication的类名放到sources即可
        application.setSources(sources);
        // 可以设置web的类型
        application.setWebApplicationType(WebApplicationType.SERVLET);
        application.run(args);
    }
}
