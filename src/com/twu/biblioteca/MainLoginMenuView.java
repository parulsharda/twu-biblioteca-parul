package com.twu.biblioteca;

public class MainLoginMenuView implements ViewInterface{
    ViewInterface quitView;
    ViewInterface loginOptionView;
    ViewInterface invalidMenuView;
    Scanner scanner;
    ViewParser viewParser;


    public MainLoginMenuView(ViewInterface quitView, ViewInterface loginOptionView, ViewInterface invalidMenuView,Scanner scanner,ViewParser viewParser) {
        this.quitView = quitView;
        this.loginOptionView = loginOptionView;
        this.invalidMenuView = invalidMenuView;
        this.scanner = scanner;
        this.viewParser = viewParser;
    }

    @Override
    public void draw() {
        System.out.print("\nMENU:\n1. Login\n2. Quit\n");
    }

    @Override
    public ViewInterface proceed(ViewInterface view) {
        return viewParser.giveNextViewToBeRendered(scanner.acceptInput());
    }
}
