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
        ArrayList<Book> collection = new ArrayList<Book>();
        Book book1 = new Book("Game of Thrones", "George R. R. Martin", "1996");
        Book book2 = new Book("Gone With the Wind", "Margaret Mitchell", "1936");
        collection.add(book1);
        collection.add(book2);
        CheckOut checkOut = new CheckOut(view, library);
        checkOut.execute();
        Mockito.verify(view).acceptInput();
    }

    @Test
    public void checkViewInput() {
        View view = Mockito.mock(View.class);
        Library library = Mockito.mock(Library.class);
        ArrayList<Book> collection = new ArrayList<Book>();
        Book book1 = new Book("Game Of Thrones", "George R. R. Martin", "1996");
        Book book2 = new Book("Gone With the Wind", "Margaret Mitchell", "1936");
        collection.add(book1);
        collection.add(book2);
        CheckOut checkOut = new CheckOut(view, library);
        Mockito.when(view.acceptInput()).thenReturn("Game of Thrones");
    }

    @Test
    public void checkIfViewMethodSuccessMsgIsCalled() {
        View view = Mockito.mock(View.class);
        Library library = Mockito.mock(Library.class);
        ArrayList<Book> collection = new ArrayList<Book>();
        Book book1 = new Book("Game of Thrones", "George R. R. Martin", "1996");
        Book book2 = new Book("Gone With the Wind", "Margaret Mitchell", "1936");
        collection.add(book1);
        collection.add(book2);
        CheckOut checkOut = new CheckOut(view, library);
        Mockito.when(view.acceptInput()).thenReturn("Game of Thrones");
        Mockito.when(library.checkout(anyString())).thenReturn(true);
        checkOut.execute();
        Mockito.verify(view).successMsg();
    }
}



