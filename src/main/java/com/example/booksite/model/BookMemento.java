package com.example.booksite.model;

public class BookMemento {

    private final String title;
    private final String writer;

    private final String category;

    private final String genre;

    private final  Double amout;


    public BookMemento(String title, String writer, String category, String genre, Double amout) {
        this.title = title;
        this.writer = writer;
        this.category = category;
        this.genre = genre;
        this.amout = amout;
    }

    public String getTitle() {
        return title;
    }
    public String getWriter() {
        return writer;
    }
    public String getCategory() {
        return category;
    }
    public Double getAmout() {return amout;}
    public String getGenre() {
        return genre;
    }}
