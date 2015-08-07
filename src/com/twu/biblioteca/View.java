package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;


public class View {


    public void welcome() {

        System.out.println("Welcome to Biblioteca");
    }


    public void show(String msg)
    {

        System.out.println(msg);
    }

    public void showBooks(ArrayList<String> booksList) {
        System.out.println("\nThe Books in Library are:");
        for (String books : booksList)
            System.out.println(" " + books);
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

    public String acceptInput()
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }


    public void displayUserMenu() {
        System.out.println("\n\nEnter your choice from the Menu:");
        System.out.println("List Books\nQuit\nCheckOut Book\nReturn Book\nList Movies\nCheckOut Movie\nReturn Movie\nLogOut\nProfile");
    }

    public void displayMenu() {
        System.out.println("\n\nEnter your choice from the Menu:");
        System.out.println("List Books\nQuit\nCheckOut Book\nReturn Book\nList CheckedOut Book\nList Movies\nCheckOut Movie\nReturn Movie\nList CheckedOut Movie\nLogOut\nProfile");
    }


    public void displayInvalidCommandMessage() {
        System.out.println("Select a valid option!");
    }

    public void successMsg() {
        System.out.println("Thank you! Enjoy the book");
    }

    public void noSuccessMsg() {
        System.out.println("That book is not available");
    }


    public void successReturnMsg() {
        System.out.println("Thank you for returning the book");
    }

    public void noSuccessReturnMsg() {
        System.out.println("That is not a valid book to return");
    }
}

