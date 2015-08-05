package com.twu.biblioteca;

import java.util.ArrayList;

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
        view.showDetailsOfBookCheckedOutBook(library.ListCheckedOutBooks());
    }
}
