package com.example.bankproject.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "credits")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Credit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "credit_id")
    private Integer id;
    @Column(name = "credit_limit")
    private int creditLimit;
    @Column (name = "interest_rate")
    private double interestRate;








}
