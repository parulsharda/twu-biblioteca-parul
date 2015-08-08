/*package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import views.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

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
        assertEquals("\nMENU:\n1. Login\n2. Quit\n",view);
    }

    @After
    public void cleanUpStreams() {

        System.setOut(original);
    }
    @Test
    public void shoudDisplayMenu(){
        System.setOut(new PrintStream(outContent));

        View view = mock(View.class);
        MenuView menuView = new MenuView(view);

        menuView.displayMenu(view);

        verify(view).show("\nMENU:\n1. Login\n2. Quit");

        System.setOut(System.out);

        }
}*/
