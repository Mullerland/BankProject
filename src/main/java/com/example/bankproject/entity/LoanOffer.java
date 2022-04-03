package com.example.bankproject.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.time.LocalDate;



@Entity
@Table(name = "loan_offer")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LoanOffer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer id;
    @Column (name = "amount_of_credit")
    private int amountOfCredit;
    @Column (name = "payment_date")
    private LocalDate paymentDate;
    @Column (name = "amount_of_payment")
    private int amountOfPayment;
    @Column (name = "loan_repayment_amount")
    private int loanRepaymentAmount;
    @Column (name = "interest_repayment_amount")
    private Double interestRepaymentAmount;


}
