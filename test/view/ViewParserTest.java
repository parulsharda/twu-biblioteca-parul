package view;

import views.InvalidMenuView;
import views.LoginOptionView;
import org.junit.Test;
import org.mockito.Mockito;
import views.QuitView;
import views.ViewInterface;
import views.ViewParser;

import static junit.framework.TestCase.assertEquals;

public class ViewParserTest {

        @Test
        public void  viewParserShouldReturnTheObjectOfLoginOptionViewClass() {

            ViewInterface loginOptionView = Mockito.mock(LoginOptionView.class);
            ViewInterface quitView = Mockito.mock(QuitView.class);
            ViewInterface invalidMenuView = Mockito.mock(InvalidMenuView.class);

            ViewParser viewParser = new ViewParser(loginOptionView,quitView,invalidMenuView);

            assertEquals(loginOptionView,viewParser.giveNextViewToBeRendered("Login"));

        }


        @Test
        public void  viewParserShouldReturnTheObjectOfQuitViewClass() {

            ViewInterface loginOptionView = Mockito.mock(LoginOptionView.class);
            ViewInterface quitView = Mockito.mock(QuitView.class);
            ViewInterface invalidMenuView = Mockito.mock(InvalidMenuView.class);

            ViewParser viewParser = new ViewParser(loginOptionView,quitView,invalidMenuView);

            assertEquals(quitView,viewParser.giveNextViewToBeRendered("Quit"));

        }
    }


