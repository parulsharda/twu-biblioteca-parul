package com.twu.biblioteca;

public class MenuView {
    View view;

    public MenuView(View view) {
        this.view = view;
    }

    public boolean displayMenu(View view) {
        view.show("\nMENU:\n1. Login\n2. Quit");
        String input = view.acceptInput();
        return !input.equals("Quit");
    }
}
