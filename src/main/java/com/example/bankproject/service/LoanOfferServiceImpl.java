package com.example.bankproject.service;

import com.example.bankproject.entity.LoanOffer;
import com.example.bankproject.repository.CreditRepository;
import com.example.bankproject.repository.LoanOfferRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanOfferServiceImpl implements LoanOfferService {

    private final LoanOfferRepository loanOfferRepository;
    private final CreditRepository creditRepository;

    public LoanOfferServiceImpl(LoanOfferRepository loanOfferRepository, CreditRepository creditRepository) {
        this.loanOfferRepository = loanOfferRepository;
        this.creditRepository = creditRepository;
    }


    @Override
    public void add(LoanOffer loanOffer) {

        loanOfferRepository.save(loanOffer);

    }

    @Override
    public List<LoanOffer> findAllLoanOffer() {

        return loanOfferRepository.findAll();
    }

    @Override
    public LoanOffer getLoanOfferById(Integer id) {
        LoanOffer loanOffer = loanOfferRepository.findById(id).get();

        return loanOffer;
    }

    @Override
    public void deleteById(Integer id) {


        loanOfferRepository.deleteById(id);
    }


}
