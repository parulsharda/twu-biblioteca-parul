package com.twu.biblioteca;
//name, year, director and movie rating
public class Movie {
    String moviename;
    String year;
    String director;
    String rating;

    public Movie(String moviename, String director, String year, String rating) {
        this.moviename = moviename;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }

    public boolean hasTitle(String searchTitle) {
        return searchTitle.equals(moviename);
    }
}
