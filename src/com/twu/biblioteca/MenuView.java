package com.twu.biblioteca;

public class MenuView {
    View view;

    public MenuView(View view) {
        this.view = view;
    }

    public boolean displayMenu(View view) {
        view.show("\nMENU:\nLogin\nQuit");
        String input = view.acceptInput();
        return !input.equals("Quit");
    }
}
