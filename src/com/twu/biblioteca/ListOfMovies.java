package com.twu.biblioteca;


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

