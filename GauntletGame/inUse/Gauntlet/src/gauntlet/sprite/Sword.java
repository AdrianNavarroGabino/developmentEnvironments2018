package gauntlet.sprite;

public class Sword extends Weapon
{
    public Sword()
    {
        spriteXCoordinates[LEFT] = new int[] { 1252 };
        spriteYCoordinates[LEFT] = new int[] { 556 };

        spriteXCoordinates[LEFT_UP] = new int[] { 1306 };
        spriteYCoordinates[LEFT_UP] = new int[] { 556 };

        spriteXCoordinates[UP] = new int[] { 928 };
        spriteYCoordinates[UP] = new int[] { 556 };

        spriteXCoordinates[RIGHT_UP] = new int[] { 982 };
        spriteYCoordinates[RIGHT_UP] = new int[] { 556 };

        spriteXCoordinates[RIGHT] = new int[] { 1036 };
        spriteYCoordinates[RIGHT] = new int[] { 556 };

        spriteXCoordinates[RIGHT_DOWN] = new int[] { 1090 };
        spriteYCoordinates[RIGHT_DOWN] = new int[] { 556 };

        spriteXCoordinates[DOWN] = new int[] { 1144 };
        spriteYCoordinates[DOWN] = new int[] { 556 };

        spriteXCoordinates[LEFT_DOWN] = new int[] { 1198 };
        spriteYCoordinates[LEFT_DOWN] = new int[] { 556 };

        updateSpriteCoordinates();
    }
}
