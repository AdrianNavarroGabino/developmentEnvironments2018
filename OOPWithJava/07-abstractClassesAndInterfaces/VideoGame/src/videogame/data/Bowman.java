package videogame.data;

/**
 *
 * @author Adrián Navarro Gabino
 */
public class Bowman extends Soldier {
    private String movementType;
    private int damage;

    public void setMovementType(String movementType) {
        this.movementType = movementType;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getMovementType() {
        return movementType;
    }

    public int getDamage() {
        return damage;
    }

    public Bowman(String movementType, int damage, String weapon, int age,
            int height, String genre, int lifeLevel) {
        super(weapon, age, height, genre, lifeLevel);
        this.movementType = movementType;
        this.damage = damage;
    }
    
    @Override
    public String toString() {
        return "Age: " + this.age + ". Height: " + this.height + ".Genre: " +
                this.genre + ".Life level: " + this.lifeLevel + ". Weapon: " +
                this.weapon + ". Movement type: " + this.movementType +
                ". Damage: " + this.damage + ".";
    }
}
