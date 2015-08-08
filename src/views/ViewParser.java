package views;

public class ViewParser {
    ViewInterface loginOptionView;
    ViewInterface quitView;
    ViewInterface invalidMenuView;

    public ViewParser(ViewInterface loginOptionView, ViewInterface quitView, ViewInterface invalidMenuView) {
        this.quitView = quitView;
        this.invalidMenuView = invalidMenuView;
        this.loginOptionView = loginOptionView;
    }


    public ViewInterface giveNextViewToBeRendered(String userInput) {
        if (userInput.equals("Login")) {
            return loginOptionView;
        }
        else if (userInput.equals("Quit")) {
            return quitView;
        }
        else {
            return invalidMenuView;
        }
    }

    public ViewInterface giveDisplayMenuBasedOnRole(String input) {
        return null;
    }
}
