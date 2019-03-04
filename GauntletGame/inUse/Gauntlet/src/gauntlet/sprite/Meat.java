package gauntlet.sprite;

/**
 *
 * @author Adrián Navarro Gabino
 */
public class Meat extends Food
{
    static final int MEAT_ENERGY = 200;
    
    public Meat(int x, int y)
    {
        super(MEAT_ENERGY);
        this.x = x;
        this.y = y;
        this.spriteX = 874;
        this.spriteY = 340;
    }
}
