package gauntlet.sprite;

/**
 *
 * @author Adrián Navarro Gabino
 */
public class Enemy2 extends Enemy
{
    public Enemy2()
    {
        spriteXCoordinates[UP] = new int[] { 1737, 2169, 225 };
        spriteYCoordinates[UP] = new int[] { 122, 122, 176 };
        
        spriteXCoordinates[RIGHT_UP] = new int[] { 1791, 2222, 279 };
        spriteYCoordinates[RIGHT_UP] = new int[] { 122, 122, 176 };
        
        spriteXCoordinates[RIGHT] = new int[] { 1845, 2276, 333 };
        spriteYCoordinates[RIGHT] = new int[] { 122, 122, 176 };
        
        spriteXCoordinates[RIGHT_DOWN] = new int[] {1899,2331,388};
        spriteYCoordinates[RIGHT_DOWN] = new int[] { 122, 122, 176 };
        
        spriteXCoordinates[DOWN] = new int[] { 1953, 10, 441 };
        spriteYCoordinates[DOWN] = new int[] { 122, 176, 176 };
        
        spriteXCoordinates[LEFT_DOWN] = new int[] {2007,64,495};
        spriteYCoordinates[LEFT_DOWN] = new int[] { 122, 176, 176 };
        
        spriteXCoordinates[LEFT] = new int[] { 2061, 117, 549 };
        spriteYCoordinates[LEFT] = new int[] { 122, 176, 176 };
        
        spriteXCoordinates[LEFT_UP] = new int[] {2115, 171, 603};
        spriteYCoordinates[LEFT_UP] = new int[] { 122, 176, 176 };
        
        updateSpriteCoordinates();
    }
}
