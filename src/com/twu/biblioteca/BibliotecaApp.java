package com.twu.biblioteca;

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
            String role = loginView.getLoginDetails(view, users, authenticateLogin);
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
                OperationOnLibrarry libraryOperation = parser.convertIntoDomain(userInput);
                libraryOperation.execute();
            }
        }
    }
}

