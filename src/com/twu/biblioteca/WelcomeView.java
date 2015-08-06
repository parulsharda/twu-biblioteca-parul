package com.twu.biblioteca;

import org.junit.After;

public class WelcomeView implements ViewInterface {

    ViewInterface loginView;

    public WelcomeView(ViewInterface loginView) {
     this.loginView = loginView;
    }

    @Override
    public void draw()
    {
        System.out.println("Welcome to Biblioteca");
    }

    @Override
    public ViewInterface proceed() {
        return loginView;
    }

}
