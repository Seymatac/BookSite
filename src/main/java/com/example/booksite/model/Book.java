package com.example.booksite.model;
import com.example.booksite.model.BookMemento;
import org.springframework.stereotype.Controller;
import org.springframework.data.jpa.repository.JpaRepository;
import jakarta.persistence.*;
import java.util.List;
@Entity
@Table (name = "bookmanagement")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false , unique = true)
    private String title;

    @Column(nullable = false)
    private String writer;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String genre;

    @Column(nullable = false)
    private Double amount;


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }
    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Double getAmount() {return amount;}
    public void setAmount(Double amount) {
        this.amount = amount;
    }

// Contructer döndürme
    public BookMemento createMemento() {
        return new BookMemento(title, writer,category,genre,amount);
    }


    public void restore(BookMemento memento) {
        this.title = memento.getTitle();
        this.writer = memento.getWriter();
        this.category=memento.getCategory();
        this.genre=memento.getGenre();
        this.amount=memento.getAmout();
    }
    @Override
    public String toString() {
        return "Book [title=" + title + ", writer=" + writer +
                ", category=" + category +", genre="+genre+",amout="+amount+"]";
    }


}


