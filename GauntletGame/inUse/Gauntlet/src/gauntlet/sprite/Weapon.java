package gauntlet.sprite;

/**
 *
 * @author Adrián Navarro Gabino
 */
import gauntlet.scene.GameScene;
import gauntlet.scene.GauntletScene;

public class Weapon extends MovableSprite
{
    public static final byte STEP_LENGTH = 4;
    
    public boolean isOutOfBounds()
    {
        return x < 0 || x > GauntletScene.GAME_WIDTH || 
               y < 0 || y > GameScene.BOTTOM_LIMIT - Sprite.SPRITE_HEIGHT;
    }
}