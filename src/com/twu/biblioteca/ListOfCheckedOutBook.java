package com.twu.biblioteca;
public class ListOfCheckedOutBook implements OperationOnLibrarry {
    View view;
    Library library;
    Users users;

    public ListOfCheckedOutBook(View view, Library library, Users users) {
        this.view = view;
        this.library = library;
        this.users = users;
    }

    @Override
    public void execute() {
        library.ListCheckedBookDetails();
    }
}
