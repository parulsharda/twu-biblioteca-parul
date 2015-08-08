package views;

public class UserDisplayMenuView implements ViewInterface {


    @Override
    public void draw()
    {
        System.out.println("\n\nEnter your choice from the Menu:");
        System.out.println("List Books\nQuit\nCheckOut Book\nReturn Book\nList Movies\nCheckOut Movie\nReturn Movie\nLogOut\nProfile");
    }

    @Override
    public ViewInterface proceed() {
        return  null;
    }
}
