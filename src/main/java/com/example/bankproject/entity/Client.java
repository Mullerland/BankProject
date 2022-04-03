package com.example.bankproject.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;



@Entity
@Table(name = "clients")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer clientId;
    @Column (name = "full_name")
    private String fullName;
    @Column (name = "phone_number")
    private int phoneNumber;
    @Column(name = "salary")
    private int salary;
    @Column (name = "email")
    private String email;
    @Column (name = "password")
    private int password;



    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "loan_offer_id")
    private LoanOffer loanOffer;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "credit_id")
    private Credit credit;



}
