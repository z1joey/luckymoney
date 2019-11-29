package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
     *
     * http://localhost:8081/luckymoney/hello/say?id=100
     * RequestParam("id")
     *
     * http://localhost:8081/luckymoney/hello/say/100
     * PathVariable("id")
     */
    @GetMapping("/say/{id}")
    public String say(@RequestParam(value = "id", required = false, defaultValue = "100") Integer id) {
        return id + limitConfig.getDescription();
    }
}
