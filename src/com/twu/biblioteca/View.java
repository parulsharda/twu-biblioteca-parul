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


    public void showDetailsOfBook(ArrayList<ArrayList<String>> collection) {
        System.out.print("\nBooks Details:\n|\t\t\tName\t\t\t|\t\t\tAuthor\t\t\t|\tYera\t\t|\n");
        System.out.println(" - - - - - - - - - - - - - -- - - -- - - - -- - - - - - - - - - - - - - -");
        for (int i = 0; i < collection.size(); i++) {
            System.out.print("|");
            ArrayList<String> currentList = collection.get(i);
            for (int j = 0; j < currentList.size(); j++) {
                System.out.print("\t" + currentList.get(j) + "\t\t|");
            }
            System.out.print("\n");
        }
    }

    public String acceptInput()
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public void displayMenu() {
        System.out.println("\n\nEnter your choice from the Menu:");
        System.out.print("1. List Books\n2. Quit\n3. Check Out\n4.Return Book\n");
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
}

