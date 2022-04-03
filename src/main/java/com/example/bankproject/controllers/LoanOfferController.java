package com.example.bankproject.controllers;

import com.example.bankproject.entity.LoanOffer;
import com.example.bankproject.service.LoanOfferService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("loan_offer/")
public class LoanOfferController {

    private final LoanOfferService loanOfferService;

    public LoanOfferController( @Autowired LoanOfferService loanOfferService) {
        this.loanOfferService = loanOfferService;
    }

    @PostMapping(path = "/add")
    public void add(@RequestBody LoanOffer loanOffer) {
        loanOfferService.add(loanOffer);
    }

    @GetMapping(path = "/get")
    public List<LoanOffer> getAllLoanOffers() {
        List<LoanOffer> loansOffer = loanOfferService.findAllLoanOffer();
        return loansOffer;

    }

    @GetMapping(path = "/get/{id}")
    public LoanOffer getById(@PathVariable Integer id) {
        return loanOfferService.getLoanOfferById(id);
    }

    @PostMapping(path = "/delete/{id}")
    public void delete(@PathVariable Integer id) {
        loanOfferService.deleteById(id);
    }
}


