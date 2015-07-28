package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;


import static junit.framework.TestCase.assertEquals;


public class BooksListTest {

    @Test
    public void shouldReturnEmptyListNoBooksListIsEmpty() {
        BooksList booksList = new BooksList();

        ArrayList<String> books = booksList.showBookList();
        ArrayList<String> expectedBooks = booksList.showBookList();

        assertEquals(expectedBooks, books);
    }

    @Test
    public void shouldReturnTheListOFBooksInTheList() {
        BooksList booksList = new BooksList();
        ArrayList<String> books = booksList.showBookList();

        ArrayList<String> expectedList = new ArrayList<String>();
        expectedList.add("The Hunger Games");
        expectedList.add("Harry Potter");
        expectedList.add("Gone With the Wind");

        assertEquals(expectedList, books);
    }
}
