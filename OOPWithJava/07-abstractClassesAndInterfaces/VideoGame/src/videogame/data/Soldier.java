package videogame.data;

/**
 *
 * @author Adrián Navarro Gabino
 */
public class Soldier extends Character {
    protected String weapon;

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }

    public Soldier(String weapon, int age, int height, String genre,
            int lifeLevel) {
        super(age, height, genre, lifeLevel);
        this.weapon = weapon;
    }
    
    @Override
    public String toString() {
        return "Age: " + this.age + ". Height: " + this.height + ".Genre: " +
                this.genre + ".Life level: " + this.lifeLevel + ". Weapon: " +
                this.weapon + ".";
    }
}
