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

/*
public class Library {
    ArrayList<LibraryItem> availableLibraryItems;
    ArrayList<LibraryItem> checkedOutLibraryItems;

    public Library(ArrayList<LibraryItem> availableLibraryItems, ArrayList<LibraryItem> checkedOutLibraryItems) {
        this.availableLibraryItems = availableLibraryItems;
        this.checkedOutLibraryItems = checkedOutLibraryItems;
    }

    public boolean checkout(String nameOfBookToCheckout) {
        for (LibraryItem item : availableLibraryItems) {
            if (item.hasTitle(nameOfBookToCheckout)) {
                availableLibraryItems.remove(item);
                checkedOutLibraryItems.add(item);
                return true;
            }
        }
        return false;
    }

    public boolean returnALibraryItem(String nameOfBookToReturn) {
        for (LibraryItem item : checkedOutLibraryItems) {
            if (item.hasTitle(nameOfBookToReturn)) {
                checkedOutLibraryItems.remove(item);
                availableLibraryItems.add(item);
                return true;
            }
        }
        return false;
    }

    public String listOfAvailableLibraryItems() {
        String list = "";
        for (int i = 0; i < availableLibraryItems.size(); i++) {
            list += String.format("%s ", availableLibraryItems.get(i));
        }
        return list;
    }

    public String listOfCheckedOutLibraryItems() {
        String list = "";
        for (int i = 0; i < checkedOutLibraryItems.size(); i++) {
            list += String.format("%s ", checkedOutLibraryItems.get(i));
        }
        return list;
    }
}
*/