package com.twu.biblioteca;

public class InvalidOption implements OperationOnLibrarry {
    private View view;

    public InvalidOption(View view)
    {
        this.view = view;
    }

    @Override
    public void execute() {
        view.displayInvalidCommandMessage();
    }
}
