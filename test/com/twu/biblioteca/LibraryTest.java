package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;


public class LibraryTest {
    @Test
    public void librarayCanCheckoutBook() {
        ArrayList<Book> collection = new ArrayList<Book>();
        Book book1 = new Book("Game Of Thrones","George R. R. Martin","1996");
        Book book2 = new Book("Gone With the Wind","Margaret Mitchell","1936");


        //book.add("Game Of Thrones");
        collection.add(book1);
        collection.add(book2);

        Library library = new Library(collection);

        boolean val = library.checkout("Game Of Thrones");
        assertEquals(true, val);
        }
}
