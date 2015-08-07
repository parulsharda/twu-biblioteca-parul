package com.twu.biblioteca;
public class Parser {

            private View view;
            private Library bookCollection;
            private Library movieCollection;


            public Parser(View view, Library bookCollection, Library movieCollection) {
                this.view = view;
                this.bookCollection = bookCollection;
                this.movieCollection = movieCollection;
            }

            public OperationOnLibrarry convertIntoDomain(String userInput,Users users) {
                OperationOnLibrarry operationOnLibrarry;

                if (userInput.equals("List Books")) {
                    operationOnLibrarry = new ListOfBooks(view,bookCollection);
                }
                else if (userInput.equals("CheckOut Book")) {
                    operationOnLibrarry = new CheckOut(view,bookCollection,users);
                }
                else if (userInput.equals("Return Book")) {
                    operationOnLibrarry = new CheckIn(view,bookCollection,users);
                }
                else if (userInput.equals("Quit")) {
                    operationOnLibrarry = new Quit();
                }
                else if(userInput.equals("List CheckedOut Book")) {
                    operationOnLibrarry = new ListOfCheckedOutBook(view,bookCollection,users);
                }
                else if(userInput.equals("List Movies")) {
                    operationOnLibrarry = new ListOfMovies(view,movieCollection);
                }
                else if(userInput.equals("CheckOut Movie")) {
                    operationOnLibrarry = new CheckOut(view,movieCollection,users);
                }
                else if(userInput.equals("Return Movie")) {
                    operationOnLibrarry = new CheckIn(view,movieCollection,users);
                }
                else if(userInput.equals("List CheckedOut Movies")) {
                    operationOnLibrarry = new ListOfCheckedOutBook(view, movieCollection,users);
                }
                else if(userInput.equals("Profile")) {
                    operationOnLibrarry = new Profile(users);
                }
                else {
                    operationOnLibrarry = new InvalidOption(view);
                }
                return operationOnLibrarry;
            }
        }

