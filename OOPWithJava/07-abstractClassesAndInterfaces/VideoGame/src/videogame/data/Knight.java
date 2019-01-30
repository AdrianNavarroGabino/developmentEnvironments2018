package videogame.data;

/**
 *
 * @author Adrián Navarro Gabino
 */
public class Knight extends Soldier {
    private String movementType;
    private int damage;
    private int horseLifeLevel;

    public void setMovementType(String movementType) {
        this.movementType = movementType;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHorseLifeLevel(int horseLifeLevel) {
        this.horseLifeLevel = horseLifeLevel;
    }

    public String getMovementType() {
        return movementType;
    }

    public int getDamage() {
        return damage;
    }

    public int getHorseLifeLevel() {
        return horseLifeLevel;
    }

    public Knight(String movementType, int damage, int horseLifeLevel,
            String weapon, int age, int height, String genre, int lifeLevel) {
        super(weapon, age, height, genre, lifeLevel);
        this.movementType = movementType;
        this.damage = damage;
        this.horseLifeLevel = horseLifeLevel;
    }
    
    @Override
    public String toString() {
        return "Age: " + this.age + ". Height: " + this.height + ".Genre: " +
                this.genre + ".Life level: " + this.lifeLevel + ". Weapon: " +
                this.weapon + ". Movement type: " + this.movementType +
                ". Damage: " + this.damage + ". Horse life level: " +
                this.horseLifeLevel + ".";
    }
}
