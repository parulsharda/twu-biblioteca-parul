package com.twu.biblioteca;


public class Profile implements OperationOnLibrarry {
    private Users users;

    public Profile(Users users) {
        this.users = users;
    }

    @Override
    public void execute() {
        System.out.format("%-20s%20s%25s\n", "Name", "Email_id", "Contact_Number");
        System.out.println(users);
    }
}


