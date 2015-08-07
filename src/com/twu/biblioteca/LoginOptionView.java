package com.twu.biblioteca;

public class LoginOptionView implements ViewInterface {
    Scanner scanner;
    ViewParser viewParser;
    ViewInterface userDisplayMenuView;
    AuthenticateLogin authenticateLogin;
    private String username;
    private String password;


    public LoginOptionView(Scanner scanner, ViewParser viewParser, AuthenticateLogin authenticateLogin, ViewInterface userDisplayMenuView) {
        this.scanner = scanner;
        this.viewParser = viewParser;
        this.authenticateLogin = authenticateLogin;
        this.userDisplayMenuView = userDisplayMenuView;
    }

    @Override
    public void draw() {

        System.out.println("Enter Username:\n");
        username = scanner.acceptInput();
        System.out.print("Enter Password:\n");
        password = scanner.acceptInput();
    }

    @Override
    public ViewInterface proceed()
    {
        return null;
    }
}
