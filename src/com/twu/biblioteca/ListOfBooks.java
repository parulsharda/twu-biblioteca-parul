package com.twu.biblioteca;

import java.util.ArrayList;

public class ListOfBooks implements OperationOnLibrarry {
    private View view;
    private Library books;

    public ListOfBooks(View view,Library books) {
        this.view = view;
        this.books = books;
    }

    @Override
    public void execute() {
        view.showDetailsOfBook(books);
    }
}

