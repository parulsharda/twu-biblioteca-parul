package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;


public class Library {

    ArrayList<LibraryItem> availableCollection;
    ArrayList<LibraryItem> checkedoutCollection;
    ArrayList<Users> userarr;
    HashMap<LibraryItem, Users> hashMap = new HashMap<LibraryItem, Users>();


    public Library(ArrayList<LibraryItem> availableLibraryItems, ArrayList<LibraryItem> checkedOutLibraryItems) {
        this.availableCollection = availableLibraryItems;
        this.checkedoutCollection = checkedOutLibraryItems;
    }


    public boolean checkout(String bookToBeCheckedOut, Users users) {
        for (LibraryItem book : availableCollection) {
            if (book.hasTitle(bookToBeCheckedOut)) {
                availableCollection.remove(book);
                checkedoutCollection.add(book);
                hashMap.put(book, users);
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
                //if(userarr.get(0).username.equals(users.username))
                hashMap.remove(book);
                return true;
            }
        }
        return false;
    }



    public void ListCheckedBookDetails() {
        for(LibraryItem item : checkedoutCollection) {
            String details = item.toString();
            details += " " + hashMap.get(item).toPrint();
            System.out.print(details);
        }
    }




    public ArrayList<LibraryItem> ListCheckedOutBooks() {
       return checkedoutCollection;
    }

    public ArrayList<LibraryItem> ListAvailableBooks() {
       return availableCollection;
    }
}
