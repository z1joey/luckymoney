package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloController {

    @GetMapping("/hello")
    public String say() {
        return "Hello World";
    }
}
