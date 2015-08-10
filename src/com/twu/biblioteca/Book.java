package com.twu.biblioteca;

public class Book implements LibraryItem {

    String bookName;
    String author;
    String year;


    public Book(String bookName, String author, String year) {
        this.bookName = bookName;
        this.author = author;
        this.year = year;
    }

    @Override
    public boolean hasTitle(String searchTitle) {
        return searchTitle.equals(bookName);

    }

    @Override
    public String toString() {
        return bookName + "\t\t\t\t" + author + "\t\t\t\t\t" + year;
    }
}
