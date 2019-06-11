package gauntlet.sprite;

public class Enemy extends MovableSprite
{    
    public static final byte STEP_LENGTH = 1;
    public static final int SCORE = 50;

    public void move(MainCharacter character)
    {
        int xDiff = character.getX() - this.getX();
        int yDiff = character.getY() - this.getY();

        if (xDiff < 0 && yDiff < 0)
        {
            this.currentDirection = MovableSprite.LEFT_UP;
            this.x -= STEP_LENGTH;
            this.y -= STEP_LENGTH;
        }
        else if (xDiff < 0 && yDiff == 0)
        {
            this.currentDirection = MovableSprite.LEFT;
            this.x -= STEP_LENGTH;
        }
        else if (xDiff < 0 && yDiff > 0)
        {
            this.currentDirection = MovableSprite.LEFT_DOWN;
            this.x -= STEP_LENGTH;
            this.y += STEP_LENGTH;
        }
        else if (xDiff > 0 && yDiff < 0)
        {
            this.currentDirection = MovableSprite.RIGHT_UP;
            this.x += STEP_LENGTH;
            this.y -= STEP_LENGTH;
        }
        else if (xDiff > 0 && yDiff == 0)
        {
            this.currentDirection = MovableSprite.RIGHT;
            this.x += STEP_LENGTH;
        }
        else if (xDiff > 0 && yDiff > 0)
        {
            this.currentDirection = MovableSprite.RIGHT_DOWN;
            this.x += STEP_LENGTH;
            this.y += STEP_LENGTH;
        }
        else if (xDiff == 0 && yDiff < 0)
        {
            this.currentDirection = MovableSprite.UP;
            this.y -= STEP_LENGTH;
        }
        else
        {
            this.currentDirection = MovableSprite.DOWN;
            this.y += STEP_LENGTH;
        }

        this.animate(this.currentDirection);
    }    
}
