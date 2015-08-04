package com.twu.biblioteca;

public class LoginView {
    View view;

    public LoginView(View view) {
        this.view = view;
    }

    public void getLoginDetails(View view) {

        view.show("Enter the User Name");
        String name = view.acceptInput();
        view.show("Enter the Password");
        String password = view.acceptInput();

      /*  if(name.equals("Parul") && (password.equals("nancy")))
        {
            view.displayMenu();
        }*/
    }
}
