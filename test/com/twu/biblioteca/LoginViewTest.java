package com.twu.biblioteca;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class LoginViewTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void toGetTheUserIdAndPassword(){
        System.setOut(new PrintStream(outContent));


        ArrayList<Users> arrusers = new ArrayList<Users>();
        Users users = new Users("Parul","nancy","Admin","nancysharma@gmail.com","9890976754");

        AuthenticateLogin authenticateLogin = new AuthenticateLogin(arrusers);
        View view = mock(View.class);
        LoginView loginView = new LoginView(view,users,authenticateLogin);

        loginView.getLoginDetails(view,authenticateLogin);

        verify(view).show("Enter the User Name");
        verify(view).show("Enter the Password");

        System.setOut(System.out);

    }
}
