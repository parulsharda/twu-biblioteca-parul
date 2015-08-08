package views;


public class WelcomeView implements ViewInterface {

    ViewInterface mainLoginMenuView;

    public WelcomeView(ViewInterface mainLoginMenuView) {
     this.mainLoginMenuView = mainLoginMenuView;
    }

    @Override
    public void draw()
    {
        System.out.println("Welcome to Biblioteca");
    }

    @Override
    public ViewInterface proceed() {
        return mainLoginMenuView;
    }

}
