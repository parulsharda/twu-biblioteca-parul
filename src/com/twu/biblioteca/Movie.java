package com.twu.biblioteca;

public class Movie implements LibraryItem{
    String moviename;
    String director;
    String year;
    String rating;

    public Movie(String moviename, String director, String year, String rating) {
        this.moviename = moviename;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }

    @Override
    public boolean hasTitle(String searchTitle) {
        return searchTitle.equals(moviename);
    }

    @Override
    public  String toString()
    {
        return moviename + "\t\t\t\t" + director + "\t\t\t\t\t" + year + "\t\t\t\t" + rating ;
    }
}


