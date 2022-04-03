package com.example.bankproject.repository;

import com.example.bankproject.entity.LoanOffer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface LoanOfferRepository extends JpaRepository<LoanOffer, Integer> {


}
