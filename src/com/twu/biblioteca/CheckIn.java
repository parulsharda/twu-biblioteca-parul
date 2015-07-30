package com.twu.biblioteca;

import java.util.ArrayList;

public class CheckIn implements OperationOnLibrarry {
    private View view;
    private ArrayList<ArrayList<String>> collection;
    private Library library;

    public CheckIn(View view, ArrayList<ArrayList<String>> collection, Library library) {
        this.view = view;
        this.collection = collection;
        this.library = library;
    }


    @Override
    public void execute() {
        String requestedBook = view.acceptInput();
        if (library.checkIn(requestedBook)) {
            view.successMsg();
        }
        else {
            view.noSuccessMsg();
        }
    }

}





