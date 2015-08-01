package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

public class CheckInTest {

    @Test
    public void xyz()
    {
        View view = Mockito.mock(View.class);
        Library library = Mockito.mock(Library.class);
        ArrayList<Book> collection = new ArrayList<Book>();
        Book book1 = new Book("Game of Thrones","George R. R. Martin","1996");
        Book book2 = new Book("Gone With the Wind","Margaret Mitchell","1936");
        collection.add(book1);
        collection.add(book2);
        /*ArrayList<String> book = new ArrayList<String>();
        book.add("Game Of Thrones");
        collection.add(book);*/
        CheckIn checkIn = new CheckIn(view, collection, library);

        Mockito.when(view.acceptInput()).thenReturn("Game of Thrones");
        checkIn.execute();

        Mockito.verify(view).acceptInput();
        Mockito.verify(library).checkIn("Game of Thrones");
    }

}
