package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {

    ArrayList<ArrayList<String>> collection;
    ArrayList<ArrayList<String>> checkoutList;

    public Library(ArrayList<ArrayList<String>> collection) {
        this.collection = collection;
        this.checkoutList = new ArrayList<ArrayList<String>>();
    }

    public boolean checkout(String bookToBeCheckedOut) {
        for (ArrayList<String> book : collection) {
            if (book.get(0).equals(bookToBeCheckedOut)) {
                collection.remove(book);
                checkoutList.add(book);
                return true;
            }
        }
        return false;
    }

    public boolean checkIn(String bookToBeReturned) {
        for (ArrayList<String> book : checkoutList) {
            if (book.get(0).equals(bookToBeReturned)) {
                checkoutList.remove(book);
                collection.add(book);
                return true;
            }
        }
        return false;
    }
}

