package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * RestController = Controller + ResponseBody
 * @author joey
 */
@Controller
public class HelloController2 {
    @Autowired
    private LimitConfig limitConfig;

    @GetMapping("/hello1")
    @ResponseBody
    public String say1() {
        return limitConfig.getDescription();
    }

    /**
     * Controller: return template named 'index'
     */
    @GetMapping("/hello2")
    public String say2() {
        return "index";
    }
}
