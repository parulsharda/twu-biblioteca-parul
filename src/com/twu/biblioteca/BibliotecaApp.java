package com.twu.biblioteca;

import java.util.ArrayList;

public class BibliotecaApp {

    private View view;
    private Parser parser;
    private LoginView loginView;
    private MenuView menuView;
    private Users users;
    private AuthenticateLogin authenticateLogin;

    public BibliotecaApp(View view, Parser parser, LoginView loginView, MenuView menuView, Users users,AuthenticateLogin authenticateLogin) {
        this.view = view;
        this.parser = parser;
        this.loginView = loginView;
        this.menuView = menuView;
        this.users = users;
        this.authenticateLogin = authenticateLogin;
    }

    public void start() {
        view.welcome();

        while(true) {
            boolean status = menuView.displayMenu(view);
            if(status == false) {
                break;
            }

            String role = loginView.getLoginDetails(view, authenticateLogin);

            while (true) {
                if(role.equals("Not valid User")) {
                    System.out.print("Not a valid user\n");
                    break;
                }
                else {
                    if (!users.isAdmin(role)) {
                    view.displayUserMenu();
                    } else
                    {
                        view.displayMenu();
                    }
                    }

                String userInput = view.acceptInput();
                if(userInput.equals("10")) {
                    break;
                }
                if(!(userInput.equals("5") || userInput.equals("9") && role.equals("Users"))) {
                    OperationOnLibrarry libraryOperation = parser.convertIntoDomain(userInput, users);
                    libraryOperation.execute();
                }
                }
        }
    }
}

