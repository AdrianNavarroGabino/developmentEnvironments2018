package videogame.data;

/**
 *
 * @author Adrián Navarro Gabino
 */
public class Farmer extends Citizen {
    private String movementType;
    private String job;
    private int workLevel;

    public void setMovementType(String movementType) {
        this.movementType = movementType;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setWorkLevel(int workLevel) {
        this.workLevel = workLevel;
    }

    public String getMovementType() {
        return movementType;
    }

    public String getJob() {
        return job;
    }

    public int getWorkLevel() {
        return workLevel;
    }

    public Farmer(String movementType, String job, int workLevel, String tool, int age, int height, String genre, int lifeLevel) {
        super(tool, age, height, genre, lifeLevel);
        this.movementType = movementType;
        this.job = job;
        this.workLevel = workLevel;
    }
    
    @Override
    public String toString() {
        return "Age: " + this.age + ". Height: " + this.height + ".Genre: " +
                this.genre + ".Life level: " + this.lifeLevel + ". Tool: " +
                this.tool + ". Movement type: " + this.movementType +
                ". Job: " + this.job + ". Work level: " + this.workLevel + ".";
    }
}
