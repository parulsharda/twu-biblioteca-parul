package com.twu.biblioteca;


public class CheckIn implements OperationOnLibrarry {
    private View view;
    private Library books;
    private  Users users;

    public CheckIn(View view, Library books, Users users) {
        this.view = view;
        this.books = books;
        this.users = users;
    }


    @Override
    public void execute() {
        String requestedBook = view.acceptInput();
        if (books.checkIn(requestedBook,users)) {
            view.successReturnMsg();
        }
        else {
            view.noSuccessReturnMsg();
        }

    }

}





