package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

public class ListOfMoviesTest {

    @Test
    public void listMoviesKnowsHowToListTheMovies() {
        View view = Mockito.mock(View.class);
        ArrayList<LibraryItem> movieCollection = new ArrayList<LibraryItem>();
        ArrayList<LibraryItem> checkedMovieCollection = new ArrayList<LibraryItem>();

        Movie movie1 = new Movie("Bajrangi Bhaijaan","2015","Kabir Khan","8.5");
        Movie movie2 = new Movie("Maine Pyaar Kyun Kiya?","2005"," David Dhawan","6.5");
        movieCollection.add(movie1);
        movieCollection.add(movie2);

        Library movielibrary = new Library(movieCollection,checkedMovieCollection);
        ListOfMovies listOfMovies = new ListOfMovies(view, movielibrary);

        listOfMovies.execute();

        Mockito.verify(view).showDetailsOfMovie(movielibrary);
        }
}


