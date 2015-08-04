package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MenuViewTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void shoudDisplayMenu(){
        System.setOut(new PrintStream(outContent));

        View view = mock(View.class);
        MenuView menuView = new MenuView(view);

        menuView.displayMenu(view);

        verify(view).show("\nMENU:\n1. Login\n2. Quit");

        System.setOut(System.out);

        }
}
