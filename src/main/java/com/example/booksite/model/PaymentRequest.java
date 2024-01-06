package com.example.booksite.model;

import com.example.booksite.controller.PaymentController;
import com.example.booksite.service.UserService;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
@Entity
@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
@Table(name = "payment request")
public class PaymentRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String paymentId;

    @Column(nullable = false, unique=true)
    private String cardNumber;

    @Column(nullable = false, unique=true)
    private String expirationDate;

    @Column(nullable = false, unique=true)
    private long cvc;

    @Column(nullable = false, unique=true)
    private Double amount;
}



