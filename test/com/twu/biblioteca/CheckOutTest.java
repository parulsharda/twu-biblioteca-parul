package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mockito;
import java.util.ArrayList;

import static org.mockito.Matchers.anyString;


public class CheckOutTest {

    @Test
    public void checkIfViewMethodIsCalled() {
        View view = Mockito.mock(View.class);
        Library library = Mockito.mock(Library.class);
        Users users = new Users("999-1919","nancy","Admin","nancysharma@gmail.com","9890976754");

        ArrayList<Book> collection = new ArrayList<Book>();
        Book book1 = new Book("Game of Thrones", "George R. R. Martin", "1996");
        Book book2 = new Book("Gone With the Wind", "Margaret Mitchell", "1936");
        collection.add(book1);
        collection.add(book2);
        CheckOut checkOut = new CheckOut(view, library,users);
        checkOut.execute();
        Mockito.verify(view).acceptInput();
    }

    @Test
    public void checkViewInput() {
        View view = Mockito.mock(View.class);
        Library library = Mockito.mock(Library.class);
        Users users = new Users("999-1919","nancy","Admin","nancysharma@gmail.com","9890976754");

        ArrayList<Book> collection = new ArrayList<Book>();
        Book book1 = new Book("Game Of Thrones", "George R. R. Martin", "1996");
        Book book2 = new Book("Gone With the Wind", "Margaret Mitchell", "1936");
        collection.add(book1);
        collection.add(book2);
        CheckOut checkOut = new CheckOut(view, library, users);
        Mockito.when(view.acceptInput()).thenReturn("Game of Thrones");
    }

}



