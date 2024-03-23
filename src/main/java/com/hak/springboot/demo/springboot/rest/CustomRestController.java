package com.hak.springboot.demo.springboot.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomRestController {
    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }


}
