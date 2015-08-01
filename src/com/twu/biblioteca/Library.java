package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {

    ArrayList<Book> collection;
    ArrayList<Book> checkoutList;

    public Library(ArrayList<Book> collection) {
        this.collection = collection;
        this.checkoutList = new ArrayList<Book>();
    }

    public boolean checkout(String bookToBeCheckedOut) {
        for (Book book : collection) {
            if (book.hasTitle(bookToBeCheckedOut)) {
                collection.remove(book);
                checkoutList.add(book);
                return true;
            }
        }
        return false;
    }

    public boolean checkIn(String bookToBeReturned) {
        for (Book book : checkoutList) {
            if (book.hasTitle(bookToBeReturned)) {
                checkoutList.remove(book);
                collection.add(book);
                return true;
            }
        }
        return false;
    }


    public ArrayList<Book> ListCheckedOutBooks() {
       return checkoutList;
    }
}

