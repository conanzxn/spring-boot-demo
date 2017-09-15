package com.sample.spring.boot.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstController {

    @GetMapping("/")
    public String home() {
        return "Hello world!";
    }

}
