package com.twu.biblioteca;

import java.util.ArrayList;


public class AuthenticateLogin {
    ArrayList<Users> users;

    public AuthenticateLogin(ArrayList<Users> users) {
        this.users = users;
    }

    public Users authenticateUser(String name, String password) {
        for (Users allUsers : users) {
            if (name.equals(allUsers.username) && (password.equals(allUsers.password))) {
                return allUsers;
            }
        }
        return null;

    }
}
