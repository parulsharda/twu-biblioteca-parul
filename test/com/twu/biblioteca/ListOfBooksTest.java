package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

public class ListOfBooksTest {

    @Test
    public void listBookKnowsHowToListTheBook() {
        View view = Mockito.mock(View.class);
        ArrayList<LibraryItem> bookCollection = new ArrayList<LibraryItem>();
        ArrayList<LibraryItem> checkedBookCollection = new ArrayList<LibraryItem>();

        Book book1 =  new Book("Game of Thrones","George R. R. Martin","1996");
        Book book2 = new Book("Gone With the Wind","Margaret Mitchell","1936");
        bookCollection.add(book1);
        bookCollection.add(book2);

        Library booklibrary = new Library(bookCollection,checkedBookCollection);
        ListOfBooks listBooks = new ListOfBooks(view, booklibrary);

        listBooks.execute();

        Mockito.verify(view).showDetailsOfBook(booklibrary);
    }
}