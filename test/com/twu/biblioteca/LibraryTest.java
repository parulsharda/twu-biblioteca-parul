package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;


public class LibraryTest {
    @Test
    public void librarayCanCheckoutBook() {

        ArrayList<LibraryItem> bookCollection = new ArrayList<LibraryItem>();
        ArrayList<LibraryItem> checkedBookCollection = new ArrayList<LibraryItem>();
        Users users = new Users("Parul","nancy","Admin");

        Book book1 =  new Book("Game of Thrones","George R. R. Martin","1996");
        Book book2 = new Book("Gone With the Wind","Margaret Mitchell","1936");
        bookCollection.add(book1);
        bookCollection.add(book2);

        Library booklibrary = new Library(bookCollection,checkedBookCollection);

        boolean val = booklibrary.checkout("Game of Thrones", users);
        assertEquals(true, val);
        }


    @Test
    public void librarayCanCheckoutMovie() {

        ArrayList<LibraryItem> movieCollection = new ArrayList<LibraryItem>();
        ArrayList<LibraryItem> checkedMovieCollection = new ArrayList<LibraryItem>();
        Users users = new Users("Parul","nancy","Admin");

        Movie movie1 = new Movie("Bajrangi Bhaijaan","2015","Kabir Khan","8.5");
        Movie movie2 = new Movie("Maine Pyaar Kyun Kiya?","2005"," David Dhawan","6.5");
        movieCollection.add(movie1);
        movieCollection.add(movie2);

        Library movielibrary = new Library(movieCollection,checkedMovieCollection);

        boolean val = movielibrary.checkout("Bajrangi Bhaijaan", users);
        assertEquals(true, val);
    }
}
