package com.twu.biblioteca;

import java.util.ArrayList;


public class Main {
    public static void main(String args[]) {
        View view = new View();
        ArrayList<LibraryItem> bookCollection = new ArrayList<LibraryItem>();
        ArrayList<LibraryItem> checkedBookCollection = new ArrayList<LibraryItem>();

        Book book1 = new Book("Game of Thrones", "George R. R. Martin", "1996");
        Book book2 = new Book("Gone With the Wind", "Margaret Mitchell", "1936");
        bookCollection.add(book1);
        bookCollection.add(book2);


        ArrayList<LibraryItem> movieCollection = new ArrayList<LibraryItem>();
        ArrayList<LibraryItem> checkedMovieCollection = new ArrayList<LibraryItem>();

        Movie movie1 = new Movie("Bajrangi Bhaijaan", "Kabir Khan", "2015", "8.5");
        Movie movie2 = new Movie("Maine Pyaar Kyun Kiya?", " David Dhawan", "2005", "6.5");
        movieCollection.add(movie1);
        movieCollection.add(movie2);

        ArrayList<Users> users = new ArrayList<Users>();
        Users user1 = new Users("999-1919","nancy","Admin","nancysharma@gmail.com","9890976754");
        Users user2  = new Users("111-1919","parul", "User","parulsharma@gmail.com","989796959");
        users.add(user1);
        users.add(user2);


        Library booklibrary = new Library(bookCollection, checkedBookCollection);
        Library movielibrary = new Library(movieCollection, checkedMovieCollection);

        AuthenticateLogin authenticateLogin = new AuthenticateLogin(users);
        Parser parser = new Parser(view, booklibrary, movielibrary);
        LoginView loginView = new LoginView(view,user1,authenticateLogin);
        MenuView menuView = new MenuView(view);

        BibliotecaApp application = new BibliotecaApp(view, parser,loginView,menuView,user1,authenticateLogin);

        WelcomeView welcomeView = new WelcomeView(loginView);

        application.start();
    }
}

