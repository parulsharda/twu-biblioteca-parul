package com.twu.biblioteca;

public class LoginOptionView implements ViewInterface {
    Scanner scanner;
    ViewParser viewParser;
    ViewInterface mainLoginMenuView;
    ViewInterface userDisplayMenuView;
    ViewInterface librarianDisplayMenuView;
    AuthenticateLogin authenticateLogin;
    private Users currentUser;



    public LoginOptionView(Scanner scanner, ViewParser viewParser, AuthenticateLogin authenticateLogin, ViewInterface userDisplayMenuView,ViewInterface mainLoginMenuView,ViewInterface librarianDisplayMenuView) {
        this.scanner = scanner;
        this.viewParser = viewParser;
        this.authenticateLogin = authenticateLogin;
        this.mainLoginMenuView = mainLoginMenuView;
        this.userDisplayMenuView = userDisplayMenuView;
        this.librarianDisplayMenuView = librarianDisplayMenuView;
        this.currentUser = null;
    }

    @Override
    public void draw() {

        System.out.println("Enter Username:\n");
        String username = scanner.acceptInput();
        System.out.print("Enter Password:\n");
        String password = scanner.acceptInput();
        currentUser = authenticateLogin.check(username,password);
    }

    @Override
    public ViewInterface proceed()
    {
        if(currentUser == null) {
            return mainLoginMenuView;
        }
        else {
            if (!currentUser.isAdmin()) {
                return userDisplayMenuView;
            }
            else
            {
                return librarianDisplayMenuView;
            }
        }
    }


}
