package com.example.booksite.model;
import com.example.booksite.model.PaymentStrategy;
import com.example.booksite.controller.PaymentController;
import org.springframework.stereotype.Component;

@Component
public class CreditCardPayment implements PaymentStrategy, ShoppingCartObserver {
    //private String cardNumber, expirationDate;
    //private long cvc;
    //private double amount;
    /*public CreditCardPayment(String cn, String ed, long cvc, double amnt) {
        this.cardNumber = cn;
        this.expirationDate = ed;
        this.cvc = cvc;
        this.amount = amnt;}*/

    @Override
    public void update(double totalAmount) {
        processPayment(totalAmount);
    }
    @Override
    public void processPayment(double amount) {

        System.out.println("Kredi Kartı ödeme tutarı" + amount + "dır.");
    }
}

