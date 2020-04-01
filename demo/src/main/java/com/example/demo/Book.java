package com.example.demo;
public class Book {
    private int bookId;
    private String bookName;
    private int bookPages;

    public Book(int bookId, String bookName, int bookPages) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPages = bookPages;
    }

    public Book() {    }
    public int getBookId() {
        return bookId;
    }
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public int getBookPages() {
        return bookPages;
    }
    public void setBookPages(int bookPages) {
        this.bookPages = bookPages;
    }
}
