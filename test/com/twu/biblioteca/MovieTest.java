package com.twu.biblioteca;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class MovieTest {

    @Test
    public void xyz() {

        Movie movie = new Movie("Bajrangi Bhaijaan", "2015", "Kabir Khan", "8.5");

        assertEquals(true, movie.hasTitle("Bajrangi Bhaijaan"));
    }
}
