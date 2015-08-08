package view;

import com.twu.biblioteca.ConsoleInputOutput;
import com.twu.biblioteca.View;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class UserDisplayMenuViewTest {


    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    PrintStream original;


    @Before
    public void setUpStreams() {
        original = System.out;
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void viewCanDisplayListOfAvailableMenu() {

        ConsoleInputOutput consoleInputOutput = new ConsoleInputOutput();
        View view = new View(consoleInputOutput);

        view.displayMenu();

        Assert.assertEquals("\n\nEnter your choice from the Menu:\n\nList Books\nList Movies\nCheckout Book\nCheckout Movie\nReturn Book\nReturn Movie\nList Checkedout Book\nList Checkedout Movie\nLogOut\nProfile\nQuit\n", outContent.toString());
    }

}