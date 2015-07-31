package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;


public class LibraryTest {
    @Test
    public void librarayCanCheckoutBook() {
        ArrayList<ArrayList<String>> collection = new ArrayList<ArrayList<String>>();
        ArrayList<String> book = new ArrayList<String>();

        book.add("Game Of Thrones");
        collection.add(book);

        Library library = new Library(collection);

        assertEquals(true, library.checkout("Game Of Thrones"));
        }
}
