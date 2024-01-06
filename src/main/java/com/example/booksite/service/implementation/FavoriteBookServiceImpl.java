package com.example.booksite.service.implementation;

import com.example.booksite.model.Book;
import com.example.booksite.model.BookMemento;
import com.example.booksite.service.FavoriteBookService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class FavoriteBookServiceImpl implements FavoriteBookService {

    private final List<Book> favoriteBooks = new ArrayList<>();

    @Override
    public void addToFavorites(Book book) {
        BookMemento memento = book.createMemento();
        favoriteBooks.add(book);

    }

    @Override
    public List<Book> getFavoriteBooks() {
        return new ArrayList<>(favoriteBooks);
    }
}
