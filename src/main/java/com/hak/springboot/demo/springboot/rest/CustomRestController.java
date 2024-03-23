package com.hak.springboot.demo.springboot.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomRestController {
    @Value("${coach.name}")
    private String coachName;

    @GetMapping("/")

    public String sayHello() {
        return this.coachName;
    }


}
