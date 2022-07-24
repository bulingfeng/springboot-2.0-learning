package com.bulingfeng.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 模仿跨域的controller
 */
@Controller
public class CorsController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }
}
