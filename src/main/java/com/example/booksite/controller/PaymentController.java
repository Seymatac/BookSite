package com.example.booksite.controller;
import com.example.booksite.model.PaymentRequest;
import com.example.booksite.model.PaymentContext;
import com.example.booksite.model.CreditCardPayment;
import com.example.booksite.model.CashPayment;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/payment")
public class PaymentController {
    @PostMapping("/creditCard")
    public ResponseEntity<String> processCreditCardPayment(@RequestBody PaymentRequest paymentRequest) {
        PaymentContext paymentContext = new PaymentContext(new CreditCardPayment());
        paymentContext.executePayment(paymentRequest.getAmount());
        return ResponseEntity.ok("Kredi Kartıyla ödeme işlemi başarıyla gerçekleşti.");
    }

    @PostMapping("/cash")
    public ResponseEntity<String> processCashPayment(@RequestBody PaymentRequest paymentRequest) {
        PaymentContext paymentContext = new PaymentContext(new CashPayment());
        paymentContext.executePayment(paymentRequest.getAmount());
        return ResponseEntity.ok("Nakit işlemi başarıyla gerçekleşti.");
    }
}

