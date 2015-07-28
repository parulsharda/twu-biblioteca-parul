package com.twu.biblioteca;

import java.util.ArrayList;


public class BooksList {

    ArrayList<String> booksList = new ArrayList<String>();

    public ArrayList<String> showBookList() {
        booksList.add("The Hunger Games");
        booksList.add("Harry Potter");
        booksList.add("Gone With the Wind");

        return booksList;
    }
}

