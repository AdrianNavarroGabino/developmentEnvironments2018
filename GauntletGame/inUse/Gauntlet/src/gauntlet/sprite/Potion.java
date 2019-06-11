package gauntlet.sprite;

public class Potion extends Food
{
    static final int POTION_ENERGY = 100;
    
    public Potion(int x, int y)
    {
        super(POTION_ENERGY);
        this.x = x;
        this.y = y;
        this.spriteX = 1360;
        this.spriteY = 340;
    }    
}
