package com.twu.biblioteca;


public class LoginView {
    View view;
    Users users;
    AuthenticateLogin authenticator;

    public LoginView(View view,Users users,AuthenticateLogin authenticator) {
        this.view = view;
        this.users = users;
        this.authenticator = authenticator;
    }

    public String getLoginDetails(View view,AuthenticateLogin authenticator) {

        view.show("Enter the User Name");
        String name = view.acceptInput();
        view.show("Enter the Password");
        String password = view.acceptInput();

        String role = authenticator.check(name,password);

        return  role;

    }
}
