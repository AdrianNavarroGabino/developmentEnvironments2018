package gauntlet.sprite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adrián Navarro Gabino
 */
public abstract class MainCharacter extends MovableSprite
{
    public static final byte STEP_LENGTH = 1;
    
    protected int energy, points;
    protected List<Weapon> weapons;
    
    public MainCharacter()
    {
        points = 0;
        weapons = new ArrayList<>();
    }
    
    public void setEnergy(int energy)
    {
        this.energy += energy;
    }
    
    public int getEnergy()
    {
        return energy;
    }

    public void setPoints(int points) {
        this.points += points;
    }

    public int getPoints() {
        return points;
    }
    
    public List<Weapon> getWeapons()
    {
        return weapons;
    }
    
    public abstract void addWeapon();
    
    public void addWeapon(Weapon w)
    {
        w.x = this.x;
        w.y = this.y;
        w.currentDirection = this.currentDirection;
        w.updateSpriteCoordinates();
        weapons.add(w);
    }
    
    public void removeWeapon(int index)
    {
        weapons.remove(index);
    }
    
    public void moveWeapons()
    {
        for(Weapon w : weapons)
        {
            switch (w.currentDirection)
            {
                case DOWN:
                    w.y += Weapon.STEP_LENGTH;
                    break;
                case LEFT:
                    w.x -= Weapon.STEP_LENGTH;
                    break;
                case LEFT_DOWN:
                    w.x -= Weapon.STEP_LENGTH;
                    w.y += Weapon.STEP_LENGTH;
                    break;
                case LEFT_UP:
                    w.x -= Weapon.STEP_LENGTH;
                    w.y -= Weapon.STEP_LENGTH;
                    break;
                case RIGHT:
                    w.x += Weapon.STEP_LENGTH;
                    break;
                case RIGHT_DOWN:
                    w.x += Weapon.STEP_LENGTH;
                    w.y += Weapon.STEP_LENGTH;
                    break;
                case RIGHT_UP:
                    w.x += Weapon.STEP_LENGTH;
                    w.y -= Weapon.STEP_LENGTH;
                    break;
                case UP:
                    w.y -= Weapon.STEP_LENGTH;
                    break;
            }
        }
    }
}
