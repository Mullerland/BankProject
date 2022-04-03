package com.example.bankproject.service;

import com.example.bankproject.entity.Credit;
import com.example.bankproject.repository.ClientRepository;
import com.example.bankproject.repository.CreditRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CreditServiceImpl implements CreditService{

    private final CreditRepository creditRepository;
    private final ClientRepository clientRepository;

    public CreditServiceImpl(CreditRepository creditRepository, ClientRepository clientRepository) {
        this.creditRepository = creditRepository;
        this.clientRepository = clientRepository;
    }


    @Override
    public void add(Credit credit) {



         creditRepository.save(credit);


    }

    @Override
    public List<Credit> findCredits() {
        return creditRepository.findAll();

    }

    @Override
    public Credit getCreditById(Integer id) {
        Credit credit = creditRepository.findById(id).get();

        return credit;    }

    @Override
    public void deleteById(Integer id) {
        creditRepository.deleteById(id);

    }
}
