package com.twu.biblioteca;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;

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

                if (userInput.equals("1")) {
                    operationOnLibrarry = new ListOfBooks(view,bookCollection);
                }
                else if (userInput.equals("3")) {
                    operationOnLibrarry = new CheckOut(view,bookCollection,users);
                }
                else if (userInput.equals("4")) {
                    operationOnLibrarry = new CheckIn(view,bookCollection);
                }
                else if (userInput.equals("2")) {
                    operationOnLibrarry = new Quit();
                }
                else if(userInput.equals("5")) {
                    operationOnLibrarry = new ListOfCheckedOutBook(view,bookCollection,users);
                }
                else if(userInput.equals("6")) {
                    operationOnLibrarry = new ListOfMovies(view,movieCollection);
                }
                else if(userInput.equals("7")) {
                    operationOnLibrarry = new CheckOut(view,movieCollection,users);
                }
                else if(userInput.equals("8")) {
                    operationOnLibrarry = new CheckIn(view,movieCollection);
                }
                else if(userInput.equals("9")) {
                    operationOnLibrarry = new ListOfCheckedOutBook(view, movieCollection,users);
                }
                else if(userInput.equals("11")) {
                    operationOnLibrarry = new Profile(users);
                }
                else {
                    operationOnLibrarry = new InvalidOption(view);
                }
                return operationOnLibrarry;
            }
        }

