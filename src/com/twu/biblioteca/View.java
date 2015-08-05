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
        System.out.println("1. List Books\n2. Quit\n3. CheckOut Book\n4. Return Book\n5. List Movies\n6. CheckOut Movie\n7. Return Movie\n8. LogOut\n9. Profile");
    }

    public void displayMenu() {
        System.out.println("\n\nEnter your choice from the Menu:");
        System.out.println("1. List Books\n2. Quit\n3. CheckOut Book\n4. Return Book\n5. List CheckedOut Book\n6. List Movies\n7. CheckOut Movie\n8. Return Movie\n9. List CheckedOut Movie\n10. LogOut\n11. Profile");
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

    /*public void showDetailsOfBookCheckedOutBook(void libraryItems) {
        System.out.format("%-25s%25s%25s\n", "Name", "Author", "Years");
        for (LibraryItem book : libraryItems) {
            System.out.println(book);
        }
    }*/
}

