package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class UserDisplayMenuViewTest {


    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    PrintStream original;


    @Before
    public void setUpStreams() {
        original = System.out;
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void viewCanDisplayListOfAvailableMenu() {

        View view = new View();

        view.displayMenu();

        Assert.assertEquals("\n\nEnter your choice from the Menu:\nList Books\n" +
                "Quit\nCheckOut Book\nReturn Book\nList CheckedOut Book\nList Movies\nCheckOut Movie\nReturn Movie\nList CheckedOut Movie\nLogOut\nProfile\n", outContent.toString());
    }
}
