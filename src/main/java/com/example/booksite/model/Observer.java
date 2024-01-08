package com.example.booksite.model;
import java.util.ArrayList;
import java.util.List;

// Observer abstract class
abstract class Observer {
    protected BookStock subject;

    // gözlemcilerin güncelleme işlemlerini gerçekleştirir.
    public abstract void update();}

// Concrete Observer classes
class LowStockObserver extends Observer {
    public LowStockObserver(BookStock subject) {
        this.subject = subject;
        this.subject.add(this);}
    @Override
    public void update() {
        if (subject.getStock() < 11) {
            System.out.println("Stok 11in altında!!");
        }}}

class OutOfStockObserver extends Observer {
    public OutOfStockObserver(BookStock subject) {
        this.subject = subject;
        this.subject.add(this);}

    @Override
    public void update() {
        if (subject.getStock() == 0) {
            System.out.println("Stok boş!!");
        }}}
