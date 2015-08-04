package com.twu.biblioteca;

import java.util.ArrayList;

public class ListOfMovies implements OperationOnLibrarry {
    private View view;
    private Library movies;

    public ListOfMovies(View view, Library movies) {
        this.view = view;
        this.movies = movies;
    }

    @Override
    public void execute() {
        view.showDetailsOfMovie(movies);
    }
}

