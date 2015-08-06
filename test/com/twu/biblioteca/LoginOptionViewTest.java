/*package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;


public class LoginOptionViewTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    PrintStream original;


    @Before
    public void setUpStreams() {
        original = System.out;
        System.setOut(new PrintStream(outContent));
    }


    @Test
    public void checkTheLoginMenuMessage() {
        ViewInterface quitView = Mockito.mock(QuitView.class);
        //ViewInterface displayMenuView = Mockito.mock(LoginOptionViewTest.class);
        ViewInterface invalidMenuView = Mockito.mock(InvalidMenuView.class);
        Scanner scanner = Mockito.mock(Scanner.class);
        ViewParser viewParser = Mockito.mock(ViewParser.class);


        MainLoginMenuView mainLoginView = new MainLoginMenuView(quitView,displayMenuView,invalidMenuView,scanner,viewParser);
        mainLoginView.draw();
        assertEquals("\nMENU:\n1. Login\n2. Quit\n", outContent.toString());
    }
}
*/