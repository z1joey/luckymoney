package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * RestController = Controller + ResponseBody
 * @author joey
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private LimitConfig limitConfig;

    /**
     * path ended with /hello or /hi
     * GetMapping({"/hello", "/hi"})
     *
     * request by get or post
     * RequestMapping("/say")
     */
    @GetMapping("/say")
    public String say() {
        return limitConfig.getDescription();
    }
}
