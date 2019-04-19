package com.wrial.boot.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class HelloController {

    @RequestMapping("/sayHello")
    public String sayHello() {

        return "Hello My First SpringBoot project！";

    }

}
