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
        ConsoleInputOutput consoleInputOutput = new ConsoleInputOutput();
        View welcomeScreen = new View(consoleInputOutput);
        welcomeScreen.welcome();
        assertEquals("Welcome to Biblioteca\n", outContent.toString());
    }



    @Test
    public void checkTheBooksListMessage() {
        ConsoleInputOutput consoleInputOutput = new ConsoleInputOutput();
        View view = new View(consoleInputOutput);

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
        ConsoleInputOutput consoleInputOutput = new ConsoleInputOutput();
        View view = new View(consoleInputOutput);

        view.displayMenu();

        Assert.assertEquals("\n\nEnter your choice from the Menu:\n\n" +
                "List Books\nList Movies\nCheckout Book\nCheckout Movie\nReturn Book\nReturn Movie\nList Checkedout Book\nList Checkedout Movie\nLogOut\nProfile\nQuit\n", outContent.toString());
    }


    @Test
    public void viewCanDisplayInvalidCommandMessage() {
        ConsoleInputOutput consoleInputOutput = new ConsoleInputOutput();
        View view = new View(consoleInputOutput);

        view.displayInvalidCommandMessage();

        Assert.assertEquals("Select a valid option!\n", outContent.toString());
    }


    @After
    public void cleanUpStreams() {

        System.setOut(original);
    }

    @Test
    public void shouldDisplayMovieList() {
        ConsoleInputOutput consoleInputOutput = new ConsoleInputOutput();
        View view = new View(consoleInputOutput);
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
