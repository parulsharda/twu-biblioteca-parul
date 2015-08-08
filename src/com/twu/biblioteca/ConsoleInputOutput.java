package com.twu.biblioteca;


public class ConsoleInputOutput {


    public String acceptInput()
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        return sc.nextLine();
    }

    public void display(String msg)

    {
        System.out.println(msg);
    }


}



