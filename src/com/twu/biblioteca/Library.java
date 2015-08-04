package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {

    ArrayList<LibraryItem> availableCollection;
    ArrayList<LibraryItem> checkedoutCollection;



    public Library(ArrayList<LibraryItem> availableLibraryItems, ArrayList<LibraryItem> checkedOutLibraryItems) {
        this.availableCollection = availableLibraryItems;
        this.checkedoutCollection = checkedOutLibraryItems;
    }


    public boolean checkout(String bookToBeCheckedOut) {
        for (LibraryItem book : availableCollection) {
            if (book.hasTitle(bookToBeCheckedOut)) {
                availableCollection.remove(book);
                checkedoutCollection.add(book);
                return true;
            }
        }
        return false;
    }

    public boolean checkIn(String bookToBeReturned) {
        for (LibraryItem book : checkedoutCollection) {
            if (book.hasTitle(bookToBeReturned)) {
                checkedoutCollection.remove(book);
                availableCollection.add(book);
                return true;
            }
        }
        return false;
    }


    public ArrayList<LibraryItem> ListCheckedOutBooks() {
       return checkedoutCollection;
    }

    public ArrayList<LibraryItem> ListAvailableBooks() {
       return availableCollection;
    }
}
