package com.twu.biblioteca;

import com.twu.biblioteca.LoginView;
import com.twu.biblioteca.View;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class LoginViewTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void toGetTheUserIdAndPassword(){
        System.setOut(new PrintStream(outContent));

        View view = mock(View.class);
        LoginView loginView = new LoginView(view);

        loginView.getLoginDetails(view);

        verify(view).show("Enter the User Name");
        verify(view).show("Enter the Password");

        System.setOut(System.out);

    }
}
