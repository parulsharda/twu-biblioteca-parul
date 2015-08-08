package com.twu.biblioteca;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;


import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class ParserTest {

    @Test
    public void parserKnowsHowToReturnLibraryOperationListBooks() {
        View view = Mockito.mock(View.class);
        Library book = Mockito.mock(Library.class);
        Library movie = Mockito.mock(Library.class);
        Parser parser = new Parser(view, book, movie);
        Users users = Mockito.mock(Users.class);

        OperationOnLibrarry result = parser.convertIntoDomain("List Books", users);

        assertEquals(ListOfBooks.class, result.getClass());
    }



    @Test
    public void parserKnowsHowToReturnLibraryOperationCheckOutBooks() {
        View view = Mockito.mock(View.class);
        Library book = Mockito.mock(Library.class);
        Library movie = Mockito.mock(Library.class);
        Parser parser = new Parser(view, book, movie);
        Users users = Mockito.mock(Users.class);

        OperationOnLibrarry result = parser.convertIntoDomain("Checkout Book", users);

        assertEquals(CheckOut.class, result.getClass());
    }



    @Test
    public void parserKnowsHowToReturnLibraryOperationReturnMovie() {
        View view = Mockito.mock(View.class);
        Library book = Mockito.mock(Library.class);
        Library movie = Mockito.mock(Library.class);
        Parser parser = new Parser(view, book, movie);
        Users users = Mockito.mock(Users.class);

        OperationOnLibrarry result = parser.convertIntoDomain("Return Movie", users);

        assertEquals(CheckIn.class, result.getClass());
    }

}


