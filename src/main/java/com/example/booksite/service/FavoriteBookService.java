package com.example.booksite.service;
import com.example.booksite.controller.BookController;
import com.example.booksite.model.Book;
import org.springframework.stereotype.Service;
import com.example.booksite.service.implementation.FavoriteBookServiceImpl;
import java.util.List;

@Service
public interface FavoriteBookService {
    void addToFavorites(Book book);
    List<Book> getFavoriteBooks();

}
