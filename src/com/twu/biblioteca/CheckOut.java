package com.twu.biblioteca;

import java.util.ArrayList;

public class CheckOut implements OperationOnLibrarry {

    private View view;
    private ArrayList<ArrayList<String>> collection;
    private  Library library;

    public CheckOut(View view, ArrayList<ArrayList<String>> collection) {
        this.view = view;
        this.collection = collection;
    }


    @Override
    public void execute() {
        String requestedBook = view.acceptInput();
        if(library.checkout(requestedBook) ==  true) {
            view.showDetailsOfBook(collection);
        }
    }
}



