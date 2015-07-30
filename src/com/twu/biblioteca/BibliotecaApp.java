package com.twu.biblioteca;


public class BibliotecaApp {

    private View view;
    private Parser parser;

    public BibliotecaApp(View view, Parser parser) {
        this.view = view;
        this.parser = parser;
    }

    public void start() {
        view.welcome();
        while (true) {
            view.displayMenu();
            String userInput = view.acceptInput();
            OperationOnLibrarry libraryOperation = parser.convertIntoDomain(userInput);
            libraryOperation.execute();
        }
    }
}

