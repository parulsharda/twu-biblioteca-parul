package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

public class ListOfBooksTest {

    @Test
    public void listBookKnowsHowToListTheBook() {
        View view = Mockito.mock(View.class);
        ArrayList<ArrayList<String>> library = new ArrayList<ArrayList<String>>();
        ListOfBooks listBooks = new ListOfBooks(view, library);

        listBooks.execute();

        Mockito.verify(view).showDetailsOfBook(library);
    }

}