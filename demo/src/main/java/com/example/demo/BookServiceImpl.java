package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private BookList bookList;

    @Override
    public BookList findAll(){
        return bookList;
    }

    @Override
    public void addBook(Book book) {
        List<Book> books = bookList.getBooks();
        book.setBookId(books.size()+1);
        books.add(book);
    }

    public BookServiceImpl() {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book(100,"Java", 332));
        books.add(new Book(200,"Python", 252));
        books.add(new Book(300,"Prolog", 132));
        bookList = new BookList();
        bookList.setBooks(books);
    }
}
