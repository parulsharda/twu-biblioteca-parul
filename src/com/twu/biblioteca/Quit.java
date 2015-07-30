package com.twu.biblioteca;


public class Quit implements OperationOnLibrarry {

    @Override
    public void execute() {
        System.exit(0);
    }
}
