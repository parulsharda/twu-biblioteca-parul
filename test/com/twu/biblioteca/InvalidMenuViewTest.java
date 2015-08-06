package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;


public class InvalidMenuViewTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    PrintStream original;


    @Before
    public void setUpStreams() {
        original = System.out;
        System.setOut(new PrintStream(outContent));
    }


    @Test
    public void checkTheLoginMenuMessage() {
        InvalidMenuView invalidMenuView = new InvalidMenuView();
        invalidMenuView.draw();
        assertEquals("Invalid Option\n", outContent.toString());
    }

    @Test
    public void shouldReturnBackToMenu() {
        ViewInterface quitView = Mockito.mock(QuitView.class);;
        ViewInterface loginOptionView = Mockito.mock(LoginOptionView.class);;
        Scanner scanner = Mockito.mock(Scanner.class);;
        ViewParser viewParser = Mockito.mock(ViewParser.class);
        InvalidMenuView invalidMenuView = new InvalidMenuView();

        MainLoginMenuView mainLoginMenuView = new MainLoginMenuView(quitView,loginOptionView, invalidMenuView, scanner, viewParser);

        assertEquals(mainLoginMenuView, invalidMenuView.proceed(mainLoginMenuView));
        }
}

