package com.twu.biblioteca;

import java.util.ArrayList;

public class View {

    public void welcome() {
        System.out.println("Welcome to Biblioteca");
    }

    public void showBooks(ArrayList<String> booksList) {
        System.out.println("\nThe Books in Library are:");
        for (String books : booksList)
            System.out.println(" " + books);
    }

    public void printnewline()
    {
        System.out.print("\n");
    }

    public void showDetailsOfBook(ArrayList<ArrayList<String>> collection) {
        System.out.print("\n Books Details:\n|\t\t\tName\t\t\t|\t\t\tAuthor\t\t\t|\tYera\t\t|\n");
        System.out.println(" - - - - - - - - - - - - - -- - - -- - - - -- - - - - - - - - - - - - - -");
        for (int i = 0; i < collection.size(); i++) {
            System.out.print("|");
            ArrayList<String> currentList = collection.get(i);
            for (int j = 0; j < currentList.size(); j++) {
                System.out.print("\t" + currentList.get(j) + "\t\t|");
            }
            printnewline();
        }
    }
}
