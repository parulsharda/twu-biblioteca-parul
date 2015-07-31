package com.twu.biblioteca;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BookTest {

    @Test
    public void shouldKnowIfTheInputTitleBelongsToIt() {

        Book book = new Book("Games of Thrones","Author","1936");

       assertEquals(true,book.hasTitle("Games of Thrones"));
    }
}
