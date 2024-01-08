package com.example.booksite.model;
import java.util.ArrayList;
import java.util.List;

public class BookStock {
    // Observer türündeki nesneleri tutar.
    private List<Observer> observers = new ArrayList<>();
    private int stock;

    public void add(Observer o) {
        observers.add(o);
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
        notifyObservers();
    }
    // gözlemcilere değişiklikleri bildirir.
    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}

