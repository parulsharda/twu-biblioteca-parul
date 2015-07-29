package com.twu.biblioteca;

import java.util.ArrayList;


public class BibliotecaApp {

    public void start(View view, ArrayList<ArrayList<String>> collection) {
        view.welcome();
        view.showDetailsOfBook(collection);
       // view.displayMenu();

    }
}


