package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

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
    public void checkTheinputAcceptingMessage() {
        ViewInterface userDisplayMenuView = Mockito.mock(UserDisplayMenuView.class);
        Scanner scanner = Mockito.mock(Scanner.class);
        ArrayList<Users> users = new ArrayList<Users>();
        Users user1 = new Users("999-1919","nancy","Admin","nancysharma@gmail.com","9890976754");
        Users user2  = new Users("111-1919","parul", "User","parulsharma@gmail.com","989796959");
        users.add(user1);
        users.add(user2);
        AuthenticateLogin authenticateLogin = new AuthenticateLogin(users);
        ViewParser viewParser = Mockito.mock(ViewParser.class);

        LoginOptionView loginOptionView = new LoginOptionView(scanner,viewParser,authenticateLogin,userDisplayMenuView);

        loginOptionView.draw();
        assertEquals("Enter Username:\n\nEnter Password:\n",outContent.toString());
    }
}
