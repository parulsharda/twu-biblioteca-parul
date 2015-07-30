package com.twu.biblioteca;

import java.util.ArrayList;

public class Parser {

            private View view;
            private ArrayList<ArrayList<String>> collection;
            private Library library;

            public Parser(View view, ArrayList<ArrayList<String>> collection,Library library) {
                this.view = view;
                this.collection = collection;
                this.library = library;
            }

            public OperationOnLibrarry convertIntoDomain(String userInput) {
                OperationOnLibrarry operationOnLibrarry;

                if (userInput.equals("List Books")) {
                    operationOnLibrarry = new ListOfBooks(view, collection);
                }
                else if (userInput.equals("Check Out")) {
                    operationOnLibrarry = new CheckOut(view, collection,library);
                }
                else if (userInput.equals("Quit")) {
                    operationOnLibrarry = new Quit();
                }
                else {
                    operationOnLibrarry = new InvalidOption(view);
                }
                return operationOnLibrarry;
            }
        }

