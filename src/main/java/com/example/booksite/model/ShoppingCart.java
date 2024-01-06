package com.example.booksite.model;
import com.example.booksite.model.ShoppingCartObservable;
import com.example.booksite.controller.ShoppingCartController;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ShoppingCart implements ShoppingCartObservable {
    private List<ShoppingCartObserver> observers = new ArrayList<>();
    private double totalAmount = 0.0;

    public void addItem(double amount) {

        totalAmount += amount;
        notifyObservers(totalAmount);
    }

    @Override
    public void addObserver(ShoppingCartObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(ShoppingCartObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(double totalAmount) {
        for (ShoppingCartObserver observer : observers) {
            observer.update(totalAmount);
        }
    }
}

