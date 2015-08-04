package com.twu.biblioteca;

import java.util.ArrayList;

public class ListOfCheckedOutBook implements OperationOnLibrarry {
    View view;
    Library books;

    public ListOfCheckedOutBook(View view, Library books) {
        this.view = view;
        this.books = books;
    }

    @Override
    public void execute() {
        view.showDetailsOfBook(books);
    }
}
