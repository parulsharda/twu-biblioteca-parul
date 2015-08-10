package com.twu.biblioteca;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class LoginViewTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    PrintStream original;

    @Before
    public void setUpStreams() {
        original = System.out;
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void toGetTheUserIdAndPassword(){

        ArrayList<Users> arrusers = new ArrayList<Users>();
        Users users = new Users("Parul","nancy","Admin","nancysharma@gmail.com","9890976754");

        AuthenticateLogin authenticateLogin = new AuthenticateLogin(arrusers);
        View view = mock(View.class);
        LoginView loginView = new LoginView(view,users,authenticateLogin);

        loginView.getLoginDetails(view,authenticateLogin);

        verify(view).show("Enter the User Name");
        verify(view).show("Enter the Password");


    }

    @After
    public void cleanUpStreams() {

        System.setOut(original);
    }
}
