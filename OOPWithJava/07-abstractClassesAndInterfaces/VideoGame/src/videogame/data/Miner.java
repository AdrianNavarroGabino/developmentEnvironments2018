package videogame.data;

/**
 *
 * @author Adrián Navarro Gabino
 */
public class Miner extends Citizen {
    private String movementType;
    private String job;
    private int fatigueLevel;

    public void setMovementType(String movementType) {
        this.movementType = movementType;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setFatigueLevel(int fatigueLevel) {
        this.fatigueLevel = fatigueLevel;
    }

    public String getMovementType() {
        return movementType;
    }

    public String getJob() {
        return job;
    }

    public int getFatigueLevel() {
        return fatigueLevel;
    }

    public Miner(String movementType, String job, int fatigueLevel, String tool, int age, int height, String genre, int lifeLevel) {
        super(tool, age, height, genre, lifeLevel);
        this.movementType = movementType;
        this.job = job;
        this.fatigueLevel = fatigueLevel;
    }
    
    @Override
    public String toString() {
        return "Age: " + this.age + ". Height: " + this.height + ".Genre: " +
                this.genre + ".Life level: " + this.lifeLevel + ". Tool: " +
                this.tool + ". Movement type: " + this.movementType +
                ". Job: " + this.job + ". Fatigue level: " +
                this.fatigueLevel + ".";
    }
}
