package com.twu.biblioteca;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class UsersTest {

    @Test
    public void checkRoleOfUser()
    {
        Users users = new Users("999-1919","nancy","Admin","nancysharma@gmail.com","9890976754");

        boolean actualuser = users.isAdmin("Admin");

        assertEquals(true,actualuser);
    }
}
