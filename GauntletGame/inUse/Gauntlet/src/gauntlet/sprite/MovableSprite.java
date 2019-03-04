package gauntlet.sprite;

/**
 *
 * @author Adrián Navarro Gabino
 */
public class MovableSprite extends Sprite
{
    public static final int TOTAL_MOVEMENTS = 8;
    public static final byte SPRITE_CHANGE = 10;    
    
    public static final int LEFT = 0;
    public static final int LEFT_UP = 1;
    public static final int UP = 2;
    public static final int RIGHT_UP = 3;
    public static final int RIGHT = 4;
    public static final int RIGHT_DOWN = 5;
    public static final int DOWN = 6;
    public static final int LEFT_DOWN = 7;
    
    protected int currentDirection;
    protected byte currentSprite;
    protected byte currentSpriteChange;    
    
    public int[][] spriteXCoordinates = new int[TOTAL_MOVEMENTS][];
    public int[][] spriteYCoordinates = new int[TOTAL_MOVEMENTS][];
    
    
    public MovableSprite()
    {
        currentDirection = LEFT;
        currentSprite = 0;
        currentSpriteChange = 0;
    }
        
    public void animate(int movement)
    {
        if (movement != currentDirection)
        {
            currentDirection = movement;
            currentSprite = 0;
            currentSpriteChange = 0;
        } else {
            currentSpriteChange++;
            if (currentSpriteChange >= SPRITE_CHANGE)
            {
                currentSpriteChange = 0;
                currentSprite = (byte)((currentSprite + 1) % 
                    spriteXCoordinates[currentDirection].length);
            }
        }
        updateSpriteCoordinates();
    }

    protected void updateSpriteCoordinates()
    {
        spriteX = spriteXCoordinates[currentDirection][currentSprite];
        spriteY = spriteYCoordinates[currentDirection][currentSprite];
    }    
}
