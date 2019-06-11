package gauntlet.sprite;

public class Musketeer extends Enemy 
{
    public Musketeer()
    {
        spriteXCoordinates[UP] = new int[] { 1306, 1738, 2170 };
        spriteYCoordinates[UP] = new int[] { 232, 232, 232 };

        spriteXCoordinates[RIGHT_UP] = new int[] { 1360, 1792, 2224 };
        spriteYCoordinates[RIGHT_UP] = new int[] { 232, 232, 232 };

        spriteXCoordinates[RIGHT] = new int[] { 1414, 1846, 2278 };
        spriteYCoordinates[RIGHT] = new int[] { 232, 232, 232 };

        spriteXCoordinates[RIGHT_DOWN] = new int[] { 1468, 1900, 2332 };
        spriteYCoordinates[RIGHT_DOWN] = new int[] { 232, 232, 232 };

        spriteXCoordinates[DOWN] = new int[] { 1522, 1954, 8 };
        spriteYCoordinates[DOWN] = new int[] { 232, 232, 286 };
    
        spriteXCoordinates[LEFT_DOWN] = new int[] { 1576, 2008, 64 };
        spriteYCoordinates[LEFT_DOWN] = new int[] { 232, 232, 286 };

        spriteXCoordinates[LEFT] = new int[] { 1630, 2062, 118 };
        spriteYCoordinates[LEFT] = new int[] { 232, 232, 286 };

        spriteXCoordinates[LEFT_UP] = new int[] { 1684, 2116, 172 };
        spriteYCoordinates[LEFT_UP] = new int[] { 232, 232, 286 };
        
        updateSpriteCoordinates();        
    }
}
