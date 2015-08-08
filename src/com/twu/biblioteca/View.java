package com.twu.biblioteca;

import java.util.ArrayList;


public class View {
    ConsoleInputOutput console;


    public View(ConsoleInputOutput console) {
        this.console = console;
    }

    public void welcome() {
        console.display("Welcome to Boblioteca");
    }


    public void show(String msg) {
        console.display(msg);
    }


    public void showDetailsOfBook(Library collection) {
        ArrayList<LibraryItem> coll = collection.ListAvailableBooks();
        System.out.format("%-25s%25s%25s\n", "Name", "Author", "Years");
        for (LibraryItem book : coll) {
            System.out.println(book);
        }
    }

    public void showDetailsOfMovie(Library movies) {
        ArrayList<LibraryItem> coll = movies.ListAvailableBooks();
        System.out.format("%-25s%25s%25s%25s\n", "Name", "Director", "Years", "Rating");
        for (LibraryItem movie : coll) {
            System.out.println(movie);
        }
    }

    public String acceptInput() {
        return console.acceptInput();
    }


    public void displayUserMenu() {
        console.display("\n\nEnter your choice from the Menu:\n");
        console.display("List Books\nList Movies\nCheckout Book\nCheckout Movie\nReturn Book\nReturn Movie\nQuit\nLogOut\nProfile");
    }

    public void displayMenu() {

        console.display("\n\nEnter your choice from the Menu:\n");
        console.display("List Books\nList Movies\nCheckout Book\nCheckout Movie\nReturn Book\nReturn Movie\nList Checkedout Book\nList Checkedout Movie\nLogOut\nProfile\nQuit");
    }


    public void displayInvalidCommandMessage() {
        console.display("Select a valid option !!");
    }

    public void successMsg() {
        console.display("Thank you! Enjoy the item");
    }

    public void noSuccessMsg() {
        console.display("That book is not available");
    }

    public void successReturnMsg() {
        console.display("Thank you for returning the book");
    }


    public void noSuccessReturnMsg() {
        console.display("That is not a valid book to return");
    }
}

