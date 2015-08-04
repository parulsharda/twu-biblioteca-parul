package com.twu.biblioteca;

import java.util.ArrayList;

public class Parser {

            private View view;
            private Library bookCollection;
            private Library movieCollection;
           /* private ArrayList<Movie> movie;
            private ArrayList<Book> book;
            private ArrayList<Book> checkedbook;
            private ArrayList<Movie> checkedmovie;
            private Library booklibrary;
            private Library movielibrary;*/


            public Parser(View view,Library bookCollection,Library movieCollection ) {
                this.view = view;
                this.bookCollection = bookCollection;
                this.movieCollection = movieCollection;
            }

            public OperationOnLibrarry convertIntoDomain(String userInput) {
                OperationOnLibrarry operationOnLibrarry;

                if (userInput.equals("List Books")) {
                    operationOnLibrarry = new ListOfBooks(view,bookCollection);
                }
                else if (userInput.equals("CheckOut Book")) {
                    operationOnLibrarry = new CheckOut(view,bookCollection);
                }
                else if (userInput.equals("Return Book")) {
                    operationOnLibrarry = new CheckIn(view,bookCollection);
                }
                else if (userInput.equals("Quit")) {
                    operationOnLibrarry = new Quit();
                }
                else if(userInput.equals("List CheckedOut Book")) {
                    operationOnLibrarry = new ListOfCheckedOutBook(view,bookCollection);
                }
                else if(userInput.equals("List Movies")) {
                    operationOnLibrarry = new ListOfMovies(view,movieCollection);
                }
                else if(userInput.equals("CheckOut Movie")) {
                    operationOnLibrarry = new CheckOut(view,movieCollection);
                }
                else if(userInput.equals("Return Movie")) {
                    operationOnLibrarry = new CheckIn(view,movieCollection);
                }
                else if(userInput.equals("List CheckedOut Movie")) {
                    operationOnLibrarry = new ListOfCheckedOutBook(view, movieCollection);
                }
                else {
                    operationOnLibrarry = new InvalidOption(view);
                }
                return operationOnLibrarry;
            }
        }

