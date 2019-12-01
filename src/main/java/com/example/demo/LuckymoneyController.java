package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

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

    /**
     * Create a luckymoney
     */
    @PostMapping("/luckymoneys")
    public  Luckymoney create(@RequestParam("producer") String producer,
                              @RequestParam("money") BigDecimal money) {
        Luckymoney luckymoney = new Luckymoney();
        luckymoney.setProducer(producer);
        luckymoney.setMoney(money);
        return repository.save(luckymoney);
    }

    /**
     * Search a luckymoney by Id
     */
    @GetMapping("/luckymoneys/{id}")
    public Luckymoney findById(@PathVariable("id") Integer id) {
        return repository.findById(id).orElse(null);
    }

    /**
     * Update a luckmoney
     * Put and Get might not share the same path (unconfirmed)
     * If the Id is not given, will generate a new one
     * The following update is actually create a new item with the same id
     */
    @PutMapping("/update/{id}")
    public Luckymoney update(@PathVariable("id") Integer id,
                             @RequestParam("consumer") String consumer) {

        Optional<Luckymoney> optional = repository.findById(id);
        if (optional.isPresent()) {
            Luckymoney luckymoney = optional.get();
            luckymoney.setConsumer(consumer);
            return repository.save(luckymoney);
        }

        return null;
    }

}
