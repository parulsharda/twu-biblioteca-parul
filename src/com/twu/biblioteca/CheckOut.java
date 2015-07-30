package com.twu.biblioteca;

import java.util.ArrayList;

public class CheckOut implements OperationOnLibrarry {

    private View view;
    private ArrayList<ArrayList<String>> collection;
    private  Library library;

    public CheckOut(View view, ArrayList<ArrayList<String>> collection,Library library) {
        this.view = view;
        this.collection = collection;
        this.library = library;
    }


    @Override
    public void execute() {
        String requestedBook = view.acceptInput();
        if(library.checkout(requestedBook)) {
            view.showDetailsOfBook(collection);
        }
    }
}



