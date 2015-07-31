package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mockito;
import java.util.ArrayList;


public class CheckOutTest {

    @Test
    public void xyz()
    {
        View view = Mockito.mock(View.class);
        Library library = Mockito.mock(Library.class);
        ArrayList<ArrayList<String>> collection = new ArrayList<ArrayList<String>>();
        ArrayList<String> book = new ArrayList<String>();
        book.add("Game Of Thrones");
        collection.add(book);
        CheckOut checkOut = new CheckOut(view, collection, library);

        Mockito.when(view.acceptInput()).thenReturn("Game of Thrones");
       // checkOut.execute();

        //Mockito.verify(view).acceptInput();
        //Mockito.verify(library).checkout("Game of Thrones");
       // Mockito.verify(view).showDetailsOfBook(collection);
    }
}
