package com.bulingfeng.springboot.controller;

import com.bulingfeng.springboot.entity.Person;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Properties;

@RestController
public class MessageConvertController {

    @PostMapping(value = "/message",
        consumes = "text/properties;charset=UTF-8"
    )
    public Properties testProperties(@RequestBody Properties person){
        return person;
    }
}
