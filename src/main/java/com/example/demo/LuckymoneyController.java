package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yizhang
 */
@RestController
public class LuckymoneyController {

    @Autowired
    private LuckymoneyRepository repository;

    @GetMapping("/luckymoneys")
    public List<Luckymoney> list() {
        return repository.findAll();
    }
}
