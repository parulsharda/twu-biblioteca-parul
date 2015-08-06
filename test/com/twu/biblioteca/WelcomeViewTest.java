package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

public class WelcomeViewTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    PrintStream original;


    @Before
    public void setUpStreams() {
        original = System.out;
        System.setOut(new PrintStream(outContent));
    }



    @Test
    public void checkTheWelcomeMessage() {
        ViewInterface mainLoginMenuView = Mockito.mock(MainLoginMenuView.class);
        WelcomeView welcomeView = new WelcomeView(mainLoginMenuView);
        welcomeView.draw();
        assertEquals("Welcome to Biblioteca\n", outContent.toString());
    }

    @Test
    public void shouldproceedToNextView() {
        ViewInterface mainLoginMenuView = Mockito.mock(MainLoginMenuView.class);
        WelcomeView welcomeView = new WelcomeView(mainLoginMenuView);
        assertEquals(mainLoginMenuView, welcomeView.proceed(welcomeView));
    }


    @After
    public void cleanUpStreams() {

        System.setOut(original);
    }
}
