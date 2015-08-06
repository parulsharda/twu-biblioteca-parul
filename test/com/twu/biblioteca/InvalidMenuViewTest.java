package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;


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
        assertEquals("Invalid Option\n",outContent.toString());
    }
}
