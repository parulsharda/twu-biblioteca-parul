package com.twu.biblioteca;


public class CheckIn implements OperationOnLibrarry {
    private View view;
    private Library books;

    public CheckIn(View view, Library books) {
        this.view = view;
        this.books = books;
    }


    @Override
    public void execute() {
        String requestedBook = view.acceptInput();
        if (books.checkIn(requestedBook)) {
            view.successReturnMsg();
        }
        else {
            view.noSuccessReturnMsg();
        }

    }

}





