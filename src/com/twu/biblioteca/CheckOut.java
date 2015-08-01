package com.twu.biblioteca;

import java.util.ArrayList;

public class CheckOut implements OperationOnLibrarry {

    private View view;
    private ArrayList<Book> collection;
    private Library library;

    public CheckOut(View view, ArrayList<Book> collection, Library library) {
        this.view = view;
        this.collection = collection;
        this.library = library;
    }


    @Override
    public void execute() {
        String requestedBook = view.acceptInput();
        if (library.checkout(requestedBook)) {
            view.successMsg();
        }
        else {
            view.noSuccessMsg();
        }
    }
}



