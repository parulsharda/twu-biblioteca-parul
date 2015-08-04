package com.twu.biblioteca;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;


import static junit.framework.TestCase.assertEquals;

public class ViewTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    PrintStream original;


    @Before
    public void setUpStreams() {
        original = System.out;
        System.setOut(new PrintStream(outContent));
    }



    @Test
    public void checkTheWelcomeMessage() {
        View welcomeScreen = new View();
        welcomeScreen.welcome();
        assertEquals("Welcome to Biblioteca\n", outContent.toString());
    }



    @Test
    public void checkTheBooksListMessage() {
        View view = new View();

        ArrayList<LibraryItem> bookCollection = new ArrayList<LibraryItem>();
        ArrayList<LibraryItem> checkedBookCollection = new ArrayList<LibraryItem>();

        Book book1 = new Book("Game of Thrones", "George R. R. Martin", "1996");
        Book book2 = new Book("Gone With the Wind", "Margaret Mitchell", "1936");
        bookCollection.add(book1);
        bookCollection.add(book2);

        Library booklibrary = new Library(bookCollection, checkedBookCollection);

        view.showDetailsOfBook(booklibrary);
        assertEquals("Name                                        Author                    Years\n" +
                "Game of Thrones				George R. R. Martin					1996\n" +
                "Gone With the Wind				Margaret Mitchell					1936\n", outContent.toString());
    }

    @Test
    public void viewCanDisplayListOfAvailableMenu() {
        View view = new View();

        view.displayMenu();

        Assert.assertEquals("\n\nEnter your choice from the Menu:\n1. List Books\n" +
                "2. Quit\n3. CheckOut Book\n4. Return Book\n5. List CheckedOut Book\n6. List Movies\n7. CheckOut Movie\n8. Return Movie\n9. List CheckedOut Movie\n", outContent.toString());
    }


    @Test
    public void viewCanDisplayInvalidCommandMessage() {
        View view = new View();

        view.displayInvalidCommandMessage();

        Assert.assertEquals("Select a valid option!\n", outContent.toString());
    }


    @After
    public void cleanUpStreams() {

        System.setOut(original);
    }

    @Test
    public void shouldDisplayMovieList() {
        View view = new View();
        ArrayList<LibraryItem> movieCollection = new ArrayList<LibraryItem>();
        ArrayList<LibraryItem> checkedMovieCollection = new ArrayList<LibraryItem>();

        Movie movie1 = new Movie("Bajrangi Bhaijaan", "Kabir Khan", "2015", "8.5");
        Movie movie2 = new Movie("Maine Pyaar Kyun Kiya?", " David Dhawan", "2005", "6.5");
        movieCollection.add(movie1);
        movieCollection.add(movie2);

        Library movielibrary = new Library(movieCollection, checkedMovieCollection);

        view.showDetailsOfMovie(movielibrary);
        assertEquals("Name                                      Director                    Years                   Rating\n" +
                "Bajrangi Bhaijaan				Kabir Khan					2015				8.5\n" +
                "Maine Pyaar Kyun Kiya?				 David Dhawan					2005				6.5\n", outContent.toString());
    }

}
