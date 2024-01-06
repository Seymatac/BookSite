package com.example.booksite.model;

import com.example.booksite.model.PaymentStrategy;
import org.springframework.stereotype.Component;
import com.example.booksite.model.ShoppingCartObserver;

@Component
public class CashPayment implements PaymentStrategy, ShoppingCartObserver {
    @Override
    public void update(double totalAmount) {
        processPayment(totalAmount);
    }

    @Override
    public void processPayment(double amount) {

        System.out.println("Nakit ödeme tutarı" + amount + "dır.");
    }
}
