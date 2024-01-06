package com.example.booksite.model;
import com.example.booksite.controller.PaymentController;
import com.example.booksite.model.PaymentStrategy;
public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment(double amount) {
        paymentStrategy.processPayment(amount);
    }
}

