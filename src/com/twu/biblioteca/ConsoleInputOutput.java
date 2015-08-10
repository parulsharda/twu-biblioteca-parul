package com.twu.biblioteca;


public class ConsoleInputOutput {

    public String acceptInput() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        return sc.nextLine();
    }

    public void format(String s, String name, String author, String msg) {
        System.out.format(s,name,author,msg);
    }

    public void display(String msg) {
        System.out.println(msg);
    }
}



