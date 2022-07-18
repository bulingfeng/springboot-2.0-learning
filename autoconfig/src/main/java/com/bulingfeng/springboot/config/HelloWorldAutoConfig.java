package com.bulingfeng.springboot.config;

import com.bulingfeng.springboot.annotation.EnableHelloWorld;

/**
 * @EnableHelloWorld 内部实现要注入的类要先于HelloWorldAutoConfig注入到spring容器中
 */
@EnableHelloWorld
public class HelloWorldAutoConfig {

    public HelloWorldAutoConfig() {
        System.out.println("HelloWorldAutoConfig");
    }
}
