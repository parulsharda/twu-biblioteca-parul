package com.twu.biblioteca;

public class Book {
    String bookname;
    String author;
    String year;

    public Book(String bookname, String author, String year) {
        this.bookname = bookname;
        this.author = author;
        this.year = year;
    }


    public boolean hasTitle(String searchTitle) {
        return searchTitle.equals(bookname);

    }

    @Override
    public  String toString()
    {
        return bookname + "\t\t\t\t" + author + "\t\t\t\t\t" + year ;
    }
}