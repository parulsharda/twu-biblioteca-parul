package com.twu.biblioteca;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class UsersTest {

    @Test
    public void checkValidityOfUser()
    {
        Users users = new Users("Parul","nancy","Admin");

        boolean actualuser = users.isAdmin();

        assertEquals(true,actualuser);
    }
}
