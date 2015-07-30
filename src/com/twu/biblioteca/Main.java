package com.twu.biblioteca;

import java.util.ArrayList;


public class Main {

    public static void main(String args[]) {
        View view = new View();
        ArrayList<ArrayList<String>> collection = new ArrayList<ArrayList<String>>();
        ArrayList<String> libraryBook1 = new ArrayList<String>();
        ArrayList<String> libraryBook2 = new ArrayList<String>();
        Parser parser = new Parser(view,collection);
        BibliotecaApp application = new BibliotecaApp(view,parser);


        libraryBook1.add("Games of Thrones");
        libraryBook1.add("George R. R. Martin");
        libraryBook1.add("1996");
        collection.add(libraryBook1);

        libraryBook2.add("Gone With the Wind ");
        libraryBook2.add("Margaret Mitchell");
        libraryBook2.add("1936");
        collection.add(libraryBook2);

        application.start();
    }
}

