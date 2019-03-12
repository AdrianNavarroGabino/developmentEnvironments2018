package gauntlet.sprite;

/**
 *
 * @author Adrián Navarro Gabino
 */
public class Axe extends Weapon
{
    public Axe()
    {
        spriteXCoordinates[LEFT] = new int[] { 1630 };
        spriteYCoordinates[LEFT] = new int[] { 502 };

        spriteXCoordinates[LEFT_UP] = new int[] { 1684 };
        spriteYCoordinates[LEFT_UP] = new int[] { 502 };

        spriteXCoordinates[UP] = new int[] { 1306 };
        spriteYCoordinates[UP] = new int[] { 502 };

        spriteXCoordinates[RIGHT_UP] = new int[] { 1360 };
        spriteYCoordinates[RIGHT_UP] = new int[] { 502 };

        spriteXCoordinates[RIGHT] = new int[] { 1414 };
        spriteYCoordinates[RIGHT] = new int[] { 502 };

        spriteXCoordinates[RIGHT_DOWN] = new int[] { 1468 };
        spriteYCoordinates[RIGHT_DOWN] = new int[] { 502 };

        spriteXCoordinates[DOWN] = new int[] { 1522 };
        spriteYCoordinates[DOWN] = new int[] { 502 };

        spriteXCoordinates[LEFT_DOWN] = new int[] { 1576 };
        spriteYCoordinates[LEFT_DOWN] = new int[] { 502 };

        updateSpriteCoordinates();
    }    
}
