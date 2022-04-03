package com.example.bankproject.controllers;

import com.example.bankproject.entity.Credit;
import com.example.bankproject.service.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/credits")
public class CreditController {

    private final CreditService creditService;

    public CreditController(@Autowired CreditService creditService) {
        this.creditService = creditService;
    }

    @PostMapping(path = "/add")
    public void add(@RequestBody Credit credit) {
       creditService.add(credit);
    }


    @GetMapping(path = "/get")
    public List<Credit> getAllCredits() {
        List<Credit> credits = creditService.findCredits();
        return credits;

    }

    @GetMapping(path = "/get/{id}")
    public Credit getById(@PathVariable Integer id) {
        return creditService.getCreditById(id);
    }

    @PostMapping(path = "/delete/{id}")
    public void delete(@PathVariable Integer id) {
        creditService.deleteById(id);
    }
}


