package Controllers;

import GameLogic.Game;
import java.awt.event.ActionEvent;

/**
 * Created by Max on 04.06.2015.
 */

public class MainMenuController {
    private static Game game;

    public static void bindTo(Game gameToBind) {
        game = gameToBind;
    }

    public void RunGame(ActionEvent event) {
        game.launchGameLoop();
    }
}
