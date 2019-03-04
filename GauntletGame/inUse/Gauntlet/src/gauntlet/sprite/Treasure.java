package gauntlet.sprite;

/**
 *
 * @author Adrián Navarro Gabino
 */
import static gauntlet.scene.GameScene.POINTS_INCREASED;

/**
 *
 * @author Adrián Navarro Gabino
 */
public class Treasure extends StaticSprite
{
    public Treasure(int x, int y) {
        this.x = x;
        this.y = y;
        spriteX = 1144;
        spriteY = 340;
    }
    
    public int getPoints()
    {
        return POINTS_INCREASED;
    }
}
