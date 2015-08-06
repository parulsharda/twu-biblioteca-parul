package com.twu.biblioteca;


public class Scanner {

    public String acceptInput()
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        return sc.nextLine();
    }
}
