package GameLogic.GameObjects.Tiles;

import GameLogic.GameObjects.Explosion;
import GameLogic.GameObjects.FieldObject;
import GameLogic.GameWindow;
import GameLogic.SpriteManager;
import javafx.scene.image.Image;

/**
 * Created by Max on 07.06.2015.
 */

public class ExplodableTile extends ImpassableTile {
    public ExplodableTile(GameWindow thisWindow, double xpos, double ypos) {
        super(thisWindow, xpos, ypos);
    }

    @Override
    protected Image getSprite() {
        return SpriteManager.getExplodableTile();
    }

    @Override
    public void explode() {
        gameWindow.removeObject(this);
    }
}
