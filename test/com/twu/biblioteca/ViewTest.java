package com.twu.biblioteca;

import org.junit.After;
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
        assertEquals("\n Books Details:\n" +
                "|\t\t\tName\t\t\t|\t\t\tAuthor\t\t\t|\tYera\t\t|\n" +
                " - - - - - - - - - - - - - -- - - -- - - - -- - - - - - - - - - - - - - -\n" +
                "|\tGames of Thrones\t\t|\tGeorge R. R. Martin\t\t|\t1996\t\t|\n" +
                "|\tGone With the Wind \t\t|\tMargaret Mitchell\t\t|\t1936\t\t|\n", outContent.toString());
    }


    @After
    public void cleanUpStreams() {
        System.setOut(original);
    }

}
