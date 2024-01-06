package com.example.booksite.model;
import org.springframework.stereotype.Controller;
import com.example.booksite.model.ShoppingCartObservable;
import com.example.booksite.model.ShoppingCartObserver;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.booksite.model.Book;
import jakarta.persistence.*;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name = "shoppingcartentity")
public class ShoppingCartEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private double totalAmount;

    @Column(nullable = false)
    private double amount;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;


    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }
}