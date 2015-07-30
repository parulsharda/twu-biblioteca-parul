package com.twu.biblioteca;

import java.util.ArrayList;


public class BibliotecaApp {
    View view;
    ArrayList<ArrayList<String>> collection;

    public BibliotecaApp(View view, ArrayList<ArrayList<String>> collection) {
        this.collection = collection;
        this.view = view;
    }


    public void start() {
        view.welcome();
        while(true) {
            //view.showDetailsOfBook(collection);
            view.displayMenu();
            String input = view.acceptInput();
        }
    }
}


