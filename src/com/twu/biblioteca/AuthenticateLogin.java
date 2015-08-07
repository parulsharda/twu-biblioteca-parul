package com.twu.biblioteca;

import java.util.ArrayList;

public class AuthenticateLogin {
    ArrayList<Users> users;

    public AuthenticateLogin(ArrayList<Users> users) {
        this.users = users;
    }

    public Users check(String name, String password) {
        for(Users itruser : users) {
            if (name.equals(itruser.username) && (password.equals(itruser.password))) {
                return itruser;
            }
        }
            return null;

    }
}
