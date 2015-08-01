package com.twu.biblioteca;

import java.util.ArrayList;


public class Main {

    public static void main(String args[]) {
        View view = new View();
        ArrayList<Book> collection = new ArrayList<Book>();
        Book book1 =  new Book("Game of Thrones","George R. R. Martin","1996");
        Book book2 = new Book("Gone With the Wind","Margaret Mitchell","1936");
        collection.add(book1);
        collection.add(book2);
        Library library = new Library(collection);
        Parser parser = new Parser(view,collection,library);
        BibliotecaApp application = new BibliotecaApp(view,parser);

        application.start();
    }
}

