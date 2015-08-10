package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static junit.framework.TestCase.assertEquals;


public class MenuViewTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    PrintStream original;


    @Before
    public void setUpStreams() {
        original = System.out;
        System.setOut(new PrintStream(outContent));
    }


    @Test
    public void checkTheLoginMenuMessage() {
        View view = Mockito.mock(View.class);

        MenuView menuView = new MenuView(view);

        Mockito.when(view.acceptInput()).thenReturn("Quit");

        boolean expected = menuView.displayMenu(view);

        assertEquals(false, expected);
    }

    @After
    public void cleanUpStreams() {

        System.setOut(original);
    }
}






