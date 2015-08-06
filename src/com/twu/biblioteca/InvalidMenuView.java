package com.twu.biblioteca;

public class InvalidMenuView implements ViewInterface {


    @Override
    public void draw() {
        System.out.print("Invalid Option\n");
    }

    @Override
    public ViewInterface proceed(ViewInterface view) {
        return view;
    }
}
