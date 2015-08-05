package com.twu.biblioteca;

public class Users {
    String username;
    String password;
    String role;


    public Users(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public boolean isAdmin(String roleOfUser) {
        if(roleOfUser.equals("Admin")) {
            return true;
        }
        else
            return false;
        }
}

