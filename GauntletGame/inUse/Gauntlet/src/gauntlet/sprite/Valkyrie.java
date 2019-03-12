package gauntlet.sprite;

/**
 *
 * @author Adrián Navarro Gabino
 */
public class Valkyrie extends MainCharacter
{ 
    public Valkyrie()
    {
        energy = 1000;
        
        spriteXCoordinates[LEFT] = new int[] { 2332, 388, 820 };
        spriteYCoordinates[LEFT] = new int[] { 502, 556, 556 };

        spriteXCoordinates[LEFT_UP] = new int[] { 8, 442, 874 };
        spriteYCoordinates[LEFT_UP] = new int[] { 556, 556, 556 };

        spriteXCoordinates[UP] = new int[] { 2008, 64, 496 };
        spriteYCoordinates[UP] = new int[] { 502, 556, 556 };

        spriteXCoordinates[RIGHT_UP] = new int[] { 2062, 118, 550 };
        spriteYCoordinates[RIGHT_UP] = new int[] { 502, 556, 556 };

        spriteXCoordinates[RIGHT] = new int[] { 2116, 172, 604 };
        spriteYCoordinates[RIGHT] = new int[] { 502, 556, 556 };

        spriteXCoordinates[RIGHT_DOWN] = new int[] { 2170, 226, 658 };
        spriteYCoordinates[RIGHT_DOWN] = new int[] { 502, 556, 556 };

        spriteXCoordinates[DOWN] = new int[] { 2224, 280, 712 };
        spriteYCoordinates[DOWN] = new int[] { 502, 556, 556 };

        spriteXCoordinates[LEFT_DOWN] = new int[] { 2278, 334, 766 };
        spriteYCoordinates[LEFT_DOWN] = new int[] { 502, 556, 556 };
        
        updateSpriteCoordinates();
    }

    @Override
    public void addWeapon() {
        Sword newSword = new Sword();
        super.addWeapon(newSword);
    }
}
