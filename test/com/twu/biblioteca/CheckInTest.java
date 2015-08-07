package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.mockito.Matchers.anyString;

public class CheckInTest {

    @Test
    public void shouldCallViewAcceptInput() {
        View view = Mockito.mock(View.class);
        Library library = Mockito.mock(Library.class);
        Users users = new Users("999-1919","nancy","Admin","nancysharma@gmail.com","9890976754");
        ArrayList<Book> collection = new ArrayList<Book>();
        Book book1 = new Book("Game of Thrones", "George R. R. Martin", "1996");
        Book book2 = new Book("Gone With the Wind", "Margaret Mitchell", "1936");
        collection.add(book1);
        collection.add(book2);
        CheckIn checkIn = new CheckIn(view, library,users);
        Mockito.when(view.acceptInput()).thenReturn("Game of Thrones");
    }


    @Test
    public void checkViewInput() {
        View view = Mockito.mock(View.class);
        Library library = Mockito.mock(Library.class);
        ArrayList<Book> collection = new ArrayList<Book>();
        Users users = new Users("999-1919","nancy","Admin","nancysharma@gmail.com","9890976754");
        Book book1 = new Book("Game Of Thrones", "George R. R. Martin", "1996");
        Book book2 = new Book("Gone With the Wind", "Margaret Mitchell", "1936");
        collection.add(book1);
        collection.add(book2);
        CheckIn checkIn= new CheckIn(view, library,users);
        Mockito.when(view.acceptInput()).thenReturn("Game of Thrones");
    }


    @Test
    public void checkIfViewMethodSuccessMsgIsCalled() {
        View view = Mockito.mock(View.class);
        Library library = Mockito.mock(Library.class);
        ArrayList<Book> collection = new ArrayList<Book>();
        Users users = new Users("999-1919","nancy","Admin","nancysharma@gmail.com","9890976754");
        Book book1 = new Book("Game of Thrones", "George R. R. Martin", "1996");
        Book book2 = new Book("Gone With the Wind", "Margaret Mitchell", "1936");
        collection.add(book1);
        collection.add(book2);
        CheckIn checkIn = new CheckIn(view, library,users);
        Mockito.when(view.acceptInput()).thenReturn("Game of Thrones");
        Mockito.when(library.checkIn(anyString(),users)).thenReturn(true);
        checkIn.execute();
        Mockito.verify(view).successReturnMsg();
    }
}