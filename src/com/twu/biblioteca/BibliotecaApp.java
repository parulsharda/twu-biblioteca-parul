package com.twu.biblioteca;

import java.util.ArrayList;

public class BibliotecaApp {

    public static void main(String[] args) {

        IO ioScreen = new IO();
        ioScreen.welcome();


        System.out.println("\nThe Books in Library are:");

        ArrayList<String> booksList = new ArrayList<String>();
        booksList.add("The Hunger Games");
        booksList.add("Harry Potter");
        booksList.add("Gone With the Wind");

        ioScreen.showBooks(booksList);

    }
}

