package com.twu.biblioteca;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
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
        ArrayList<ArrayList<String>> collection = new ArrayList<ArrayList<String>>();
        ArrayList<String> libraryBook1 = new ArrayList<String>();
        ArrayList<String> libraryBook2 = new ArrayList<String>();

        libraryBook1.add("Games of Thrones");
        libraryBook1.add("George R. R. Martin");
        libraryBook1.add("1996");
        collection.add(libraryBook1);

        libraryBook2.add("Gone With the Wind ");
        libraryBook2.add("Margaret Mitchell");
        libraryBook2.add("1936");
        collection.add(libraryBook2);

        view.showDetailsOfBook(collection);
        assertEquals("Name                                        Author                    Years\n" +
                "Games of Thrones               George R. R. Martin                     1996\n" +
                "Gone With the Wind               Margaret Mitchell                     1936\n",outContent.toString());
        /*assertEquals("Name                                        Author                    Years
                        - - - - - - - - - - - - - -- - - -- - - - -- - - - - - - - - - - - - - - -

                        Games of Thrones               George R. R. Martin                     1996
                Gone With the Wind               Margaret Mitchell                     1936", outContent.toString());*/
    }

    @Test
    public void viewCanDisplayListOfAvailableMenu() {
        View view = new View();

        view.displayMenu();

        Assert.assertEquals("\n\nEnter your choice from the Menu:\n1. List Books\n" +
                "2. Quit\n3. Check Out\n4. Return Book\n", outContent.toString());
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

}
