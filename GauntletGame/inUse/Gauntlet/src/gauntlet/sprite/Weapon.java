package gauntlet.sprite;

import gauntlet.scene.GameScene;
import gauntlet.scene.GauntletScene;

public class Weapon extends MovableSprite
{
    public static final byte STEP_LENGTH = 4;
    
    public boolean isOutOfBounds(int gameWidth, int gameHeight)
    {
        return x < 0 || x > gameWidth || 
               y < 0 || y > gameHeight;
    }
}
