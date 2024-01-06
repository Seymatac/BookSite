package com.example.booksite.model;

public interface ShoppingCartObservable {
    void addObserver(ShoppingCartObserver observer);
    void removeObserver(ShoppingCartObserver observer);
    void notifyObservers(double totalAmount);
}
