package com.twu.biblioteca;

import java.util.ArrayList;

public class ListOfCheckedOutBook implements OperationOnLibrarry {
    View view;
    ArrayList<Book> books;
    Library library;

    public ListOfCheckedOutBook(View view, ArrayList<Book> books, Library library) {
        this.view = view;
        this.books = books;
        this.library = library;
    }

    @Override
    public void execute() {
        view.showDetailsOfBook(library.ListCheckedOutBooks());
    }
}
