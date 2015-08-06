import com.twu.biblioteca.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.net.Authenticator;
import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class WelcomeViewTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    PrintStream original;


    @Before
    public void setUpStreams() {
        original = System.out;
        System.setOut(new PrintStream(outContent));
    }



    @Test
    public void checkTheWelcomeMessage() {
        View view = new View();
        Users users = new Users("999-1919","nancy","Admin","nancysharma@gmail.com","9890976754");
        AuthenticateLogin authenticator = new AuthenticateLogin(new ArrayList<Users>());
        LoginView loginView = new LoginView(view,users,authenticator);
        WelcomeView welcomeView = new WelcomeView(loginView);
        welcomeView.draw();
        assertEquals("Welcome to Biblioteca\n", outContent.toString());
    }

    @After
    public void cleanUpStreams() {

        System.setOut(original);
    }
}
