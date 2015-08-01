package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;


public class View {

    public void welcome() {
        System.out.println("Welcome to Biblioteca");
    }

    public void showBooks(ArrayList<String> booksList) {
        System.out.println("\nThe Books in Library are:");
        for (String books : booksList)
            System.out.println(" " + books);
    }


    public void showDetailsOfBook(ArrayList<Book> collection) {
        System.out.format("%-25s%25s%25s\n","Name","Author","Years");
       /* for (int i = 0; i < collection.size(); i++) {
            ArrayList<Book> currentList = collection.get(i);
            System.out.format("%-25s%25s%25s",currentList.get(0),currentList.get(1),currentList.get(2));
            System.out.print("\n");
        }*/
        for (Book book : collection) {
            System.out.println(book);
        }
    }

    public String acceptInput()
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public void displayMenu() {
        System.out.println("\n\nEnter your choice from the Menu:");
        System.out.println("1. List Books\n2. Quit\n3. Check Out\n4. Return Book");
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

