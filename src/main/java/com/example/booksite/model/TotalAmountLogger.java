package com.example.booksite.model;
import com.example.booksite.model.ShoppingCartObserver;

public class TotalAmountLogger implements ShoppingCartObserver {
    private ShoppingCartEntity shoppingCart;

    public TotalAmountLogger(ShoppingCartEntity shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public void update(double totalAmount) {
        System.out.println("Toplam tutar güncellendi: " + shoppingCart.getTotalAmount());
    }
}