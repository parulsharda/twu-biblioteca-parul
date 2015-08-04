package com.twu.biblioteca;

import java.util.ArrayList;

public class CheckOut implements OperationOnLibrarry {

    private View view;
    private Library library;

    public CheckOut(View view,Library library) {
        this.view = view;
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



