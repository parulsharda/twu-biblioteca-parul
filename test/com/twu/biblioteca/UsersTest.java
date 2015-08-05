package com.twu.biblioteca;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class UsersTest {

    @Test
    public void checkRoleOfUser()
    {
        Users users = new Users("Parul","nancy","Admin");

        boolean actualuser = users.isAdmin("Admin");

        assertEquals(true,actualuser);
    }
}
