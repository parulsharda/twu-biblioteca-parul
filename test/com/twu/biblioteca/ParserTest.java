/*package com.twu.biblioteca;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class ParserTest {

    @Test
    public void parserKnowsHowToReturnLibraryOperation() {
        View view = Mockito.mock(View.class);
        ArrayList<ArrayList<String>> library = new ArrayList<ArrayList<String>>();
        Parser parser = new Parser(view, library);

        OperationOnLibrarry result = parser.convertIntoDomain("List Books");

        assertEquals(ListOfBooks.class, result.getClas
        */