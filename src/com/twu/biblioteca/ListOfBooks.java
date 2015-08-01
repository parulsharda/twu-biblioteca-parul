package com.twu.biblioteca;

import java.util.ArrayList;

public class ListOfBooks implements OperationOnLibrarry {
    private View view;
    private ArrayList<Book> library;

    public ListOfBooks(View view, ArrayList<Book> library) {
        this.view = view;
        this.library = library;
    }

    @Override
    public void execute() {

        view.showDetailsOfBook(library);
    }
}

