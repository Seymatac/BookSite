package com.example.booksite.model;
import com.example.booksite.model.PaymentStrategy;
import com.example.booksite.controller.PaymentController;
import org.springframework.stereotype.Component;

@Component
public class CreditCardPayment implements PaymentStrategy, ShoppingCartObserver {
    @Override
    public void update(double totalAmount) {
        processPayment(totalAmount);
    }
    @Override
    public void processPayment(double amount) {

        System.out.println("Kredi Kartı ödeme tutarı" + amount + "dır.");
    }
}

