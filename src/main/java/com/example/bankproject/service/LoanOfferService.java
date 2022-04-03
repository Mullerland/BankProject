package com.example.bankproject.service;

import com.example.bankproject.entity.LoanOffer;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface LoanOfferService {
    public void add(LoanOffer loanOffer);

    public List<LoanOffer> findAllLoanOffer();

    public LoanOffer getLoanOfferById(Integer id);


     public void deleteById(Integer id);
}
