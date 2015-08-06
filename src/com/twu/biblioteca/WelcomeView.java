package com.twu.biblioteca;


public class WelcomeView implements ViewInterface {

    ViewInterface mainLoginMenuView;

    public WelcomeView(ViewInterface mainLoginMenuView) {
     this.mainLoginMenuView = mainLoginMenuView;
    }

    @Override
    public void draw()
    {
        System.out.println("Welcome to Biblioteca");
    }

    @Override
    public ViewInterface proceed(ViewInterface view) {
        return mainLoginMenuView;
    }

}
