package com.twu.biblioteca;


public class BibliotecaApp {

    private View view;
    private Parser parser;
    private LoginView loginView;

    public BibliotecaApp(View view, Parser parser, LoginView loginView) {
        this.view = view;
        this.parser = parser;
        this.loginView = loginView;
    }

    public void start() {
        loginView.getLoginDetails(view);
        view.welcome();
        while (true) {
            view.displayMenu();
            String userInput = view.acceptInput();
            OperationOnLibrarry libraryOperation = parser.convertIntoDomain(userInput);
            libraryOperation.execute();
        }
    }
}

