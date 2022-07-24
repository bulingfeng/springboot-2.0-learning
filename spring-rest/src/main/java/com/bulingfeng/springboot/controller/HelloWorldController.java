package com.bulingfeng.springboot.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @CrossOrigin("*")
    @GetMapping("/hello")
    public String helloWorld(){
        return "hello-world";
    }
}
