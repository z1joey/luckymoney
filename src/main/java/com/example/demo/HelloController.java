package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * RestController = Controller + ResponseBody
 * @author joey
 */
@RestController
public class HelloController {
    @Autowired
    private LimitConfig limitConfig;

    @GetMapping("/hello")
    public String say() {
        return limitConfig.getDescription();
    }
}
