package views;

public class InvalidMenuView implements ViewInterface {


    @Override
    public void draw() {
        System.out.print("Invalid Option\n");
    }

    @Override
    public ViewInterface proceed() {
      return null;
    }
}
