package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

public class WelcomeScreenTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    PrintStream original;

    @Before
    public void setUpStreams() {
        original = System.out;
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void checkTheInput() {
        WelcomeScreen welcomeScreen = new WelcomeScreen();
        welcomeScreen.welcome();
        assertEquals("Welcome to Biblioteca", outContent.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(original);
    }

}
