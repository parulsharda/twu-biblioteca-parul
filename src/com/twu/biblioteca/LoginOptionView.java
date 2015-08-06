package com.twu.biblioteca;

public class LoginOptionView implements ViewInterface {
    Scanner scanner;
    ViewParser viewParser;

    @Override
    public void draw() {

        System.out.println("Enter username:\n");
        String username = scanner.acceptInput();
        System.out.print("Enter Password:\n");
        String password = scanner.acceptInput();



    }

    @Override
    public ViewInterface proceed(ViewInterface view)
    {
        return null;
    }
}
