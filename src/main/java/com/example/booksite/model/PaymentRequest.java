package com.example.booksite.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
@Table(name = "paymentrequest")
public class PaymentRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long paymentId;

    @Column(nullable = false, unique=true)
    private String cardNumber;

    @Column(nullable = false, unique=true)
    private String expirationDate;

    @Column(nullable = false, unique=true)
    private Long cvc;

    @Column(nullable = false, unique=true)
    private Double amount;
}



