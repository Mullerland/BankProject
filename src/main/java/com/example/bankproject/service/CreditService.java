package com.example.bankproject.service;

import com.example.bankproject.entity.Credit;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CreditService {
    public void add(Credit credit);

    public List<Credit> findCredits();

    public Credit getCreditById(Integer id);

     public void deleteById(Integer id);
}
