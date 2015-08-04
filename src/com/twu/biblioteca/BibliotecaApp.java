package com.twu.biblioteca;


public class BibliotecaApp {

    private View view;
    private Parser parser;
    private LoginView loginView;
    private MenuView menuView;

    public BibliotecaApp(View view, Parser parser, LoginView loginView, MenuView menuView) {
        this.view = view;
        this.parser = parser;
        this.loginView = loginView;
        this.menuView = menuView;
    }

    public void start() {
        view.welcome();
        menuView.displayMenu(view);
        loginView.getLoginDetails(view);
        while (true) {
            view.displayMenu();
            String userInput = view.acceptInput();
            OperationOnLibrarry libraryOperation = parser.convertIntoDomain(userInput);
            libraryOperation.execute();
        }
    }
}

