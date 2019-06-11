package gauntlet.sprite;

public class Arrow extends Weapon
{
    public Arrow()
    {
        spriteXCoordinates[LEFT] = new int[] { 496 };
        spriteYCoordinates[LEFT] = new int[] { 664 };

        spriteXCoordinates[LEFT_UP] = new int[] { 550 };
        spriteYCoordinates[LEFT_UP] = new int[] { 664 };

        spriteXCoordinates[UP] = new int[] { 172 };
        spriteYCoordinates[UP] = new int[] { 664 };

        spriteXCoordinates[RIGHT_UP] = new int[] { 226 };
        spriteYCoordinates[RIGHT_UP] = new int[] { 664 };

        spriteXCoordinates[RIGHT] = new int[] { 280 };
        spriteYCoordinates[RIGHT] = new int[] { 664 };

        spriteXCoordinates[RIGHT_DOWN] = new int[] { 334 };
        spriteYCoordinates[RIGHT_DOWN] = new int[] { 664 };

        spriteXCoordinates[DOWN] = new int[] { 388 };
        spriteYCoordinates[DOWN] = new int[] { 664 };

        spriteXCoordinates[LEFT_DOWN] = new int[] { 442 };
        spriteYCoordinates[LEFT_DOWN] = new int[] { 664 };

        updateSpriteCoordinates();
    }
}
