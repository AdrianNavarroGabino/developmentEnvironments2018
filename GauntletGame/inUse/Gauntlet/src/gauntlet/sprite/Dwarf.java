package gauntlet.sprite;

/**
 *
 * @author Adrián Navarro Gabino
 */
public class Dwarf extends MainCharacter
{
    public Dwarf()
    {
        energy = 800;
        
        spriteXCoordinates[LEFT] = new int[] { 1576, 2008, 64 };
        spriteYCoordinates[LEFT] = new int[] { 610, 610, 664 };

        spriteXCoordinates[LEFT_UP] = new int[] { 1630, 2062, 118 };
        spriteYCoordinates[LEFT_UP] = new int[] { 610, 610, 664 };

        spriteXCoordinates[UP] = new int[] { 1252, 1684, 2116 };
        spriteYCoordinates[UP] = new int[] { 610, 610, 610 };

        spriteXCoordinates[RIGHT_UP] = new int[] { 1306, 1738, 2170 };
        spriteYCoordinates[RIGHT_UP] = new int[] { 610, 610, 610 };

        spriteXCoordinates[RIGHT] = new int[] { 1360, 1792, 2224 };
        spriteYCoordinates[RIGHT] = new int[] { 610, 610, 610 };

        spriteXCoordinates[RIGHT_DOWN] = new int[] { 1414, 1846, 2278 };
        spriteYCoordinates[RIGHT_DOWN] = new int[] { 610, 610, 610 };

        spriteXCoordinates[DOWN] = new int[] { 1468, 1900, 2332 };
        spriteYCoordinates[DOWN] = new int[] { 610, 610, 610 };

        spriteXCoordinates[LEFT_DOWN] = new int[] { 1522, 1954, 8 };
        spriteYCoordinates[LEFT_DOWN] = new int[] { 610, 610, 664 };
        
        updateSpriteCoordinates();
    }

    @Override
    public void addWeapon() {
        Arrow newArrow = new Arrow();
        super.addWeapon(newArrow);
    }
}
