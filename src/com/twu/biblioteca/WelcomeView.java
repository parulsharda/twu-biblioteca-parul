package com.twu.biblioteca;

import org.junit.After;

public class WelcomeView implements ViewInterface {

    LoginView loginView;

    public WelcomeView(LoginView loginView) {
     this.loginView = loginView;
    }

    @Override
    public void draw()
    {
        System.out.println("Welcome to Biblioteca");
    }

    @Override
    public ViewInterface proceed() {
        return null;
    }

}
