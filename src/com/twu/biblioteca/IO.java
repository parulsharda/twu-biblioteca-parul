package com.twu.biblioteca;

import java.util.ArrayList;

public class IO {

    public void welcome()
    {
        System.out.println("Welcome to Biblioteca");
    }

    public void showBooks(ArrayList<String> booksList) {
        for(String books : booksList)
            System.out.println(" "+books);
    }
}
