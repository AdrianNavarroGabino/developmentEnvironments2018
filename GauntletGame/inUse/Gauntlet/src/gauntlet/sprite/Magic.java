package gauntlet.sprite;

public class Magic extends Weapon
{
    public Magic()
    {
        spriteXCoordinates[LEFT] = new int[] { 874 };
        spriteYCoordinates[LEFT] = new int[] { 610 };

        spriteXCoordinates[LEFT_UP] = new int[] { 928 };
        spriteYCoordinates[LEFT_UP] = new int[] { 610 };

        spriteXCoordinates[UP] = new int[] { 550 };
        spriteYCoordinates[UP] = new int[] { 610 };

        spriteXCoordinates[RIGHT_UP] = new int[] { 604 };
        spriteYCoordinates[RIGHT_UP] = new int[] { 610 };

        spriteXCoordinates[RIGHT] = new int[] { 658 };
        spriteYCoordinates[RIGHT] = new int[] { 610 };

        spriteXCoordinates[RIGHT_DOWN] = new int[] { 712 };
        spriteYCoordinates[RIGHT_DOWN] = new int[] { 610 };

        spriteXCoordinates[DOWN] = new int[] { 766 };
        spriteYCoordinates[DOWN] = new int[] { 610 };

        spriteXCoordinates[LEFT_DOWN] = new int[] { 820 };
        spriteYCoordinates[LEFT_DOWN] = new int[] { 610 };

        updateSpriteCoordinates();
    }
}
