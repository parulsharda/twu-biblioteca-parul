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


    public boolean isAdmin() {

        return role.equals("Admin");
    }
       /* if(roleOfUser.equals(role)) {
            return true;
        }
        else
            return false;
        }*/


    public String toPrint() {
        return username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Users users = (Users) o;

        if (username != null ? !username.equals(users.username) : users.username != null) return false;
        if (password != null ? !password.equals(users.password) : users.password != null) return false;
        if (role != null ? !role.equals(users.role) : users.role != null) return false;
        if (email_id != null ? !email_id.equals(users.email_id) : users.email_id != null) return false;
        return !(contact_number != null ? !contact_number.equals(users.contact_number) : users.contact_number != null);

    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        result = 31 * result + (email_id != null ? email_id.hashCode() : 0);
        result = 31 * result + (contact_number != null ? contact_number.hashCode() : 0);
        return result;
    }
}

