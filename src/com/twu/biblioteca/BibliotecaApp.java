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
        view.showDetailsOfBook(collection);
    }
}


