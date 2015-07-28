package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;


public class BooksListTest {

    @Test
    public void shouldReturnEmptyListNoBooksListIsEmpty() {
        BooksList booksList = new BooksList();

        ArrayList<String> books = booksList.showBookList();
        ArrayList<String> expectedBooks = booksList.showBookList();

        assertEquals(expectedBooks, books);
    }
}
