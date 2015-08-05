package com.twu.biblioteca;

public class Users {
    String username;
    String password;
    String role;
    String email_id;
    String contact_number;


    public Users(String username, String password, String role,String email_id,String contact_number) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.email_id = email_id;
        this.contact_number = contact_number;
    }

    @Override
    public  String toString()
    {
        return username + "\t\t\t\t" + email_id + "\t\t\t\t\t" + contact_number  ;
    }


    public boolean isAdmin(String roleOfUser) {
        if(roleOfUser.equals(role)) {
            return true;
        }
        else
            return false;
        }


    public String toPrint() {
        return username;
    }
}

