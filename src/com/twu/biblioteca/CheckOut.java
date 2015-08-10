package com.twu.biblioteca;


public class CheckOut implements OperationOnLibrarry {

    private View view;
    private Library library;
    private Users users;

    public CheckOut(View view, Library library, Users users) {
        this.view = view;
        this.library = library;
        this.users = users;
    }


    @Override
    public void execute() {
        String requestedBook = view.acceptInput();
        if (library.checkout(requestedBook, users)) {
            view.successMsg();
        } else {
            view.noSuccessMsg();
        }
    }
}



