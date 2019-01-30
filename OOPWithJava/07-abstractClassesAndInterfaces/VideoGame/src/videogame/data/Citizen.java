package videogame.data;

/**
 *
 * @author Adrián Navarro Gabino
 */
public class Citizen extends Character {
    protected String tool;

    public void setTool(String tool) {
        this.tool = tool;
    }

    public String getTool() {
        return tool;
    }

    public Citizen(String tool, int age, int height, String genre, int lifeLevel) {
        super(age, height, genre, lifeLevel);
        this.tool = tool;
    }
    
    @Override
    public String toString() {
        return "Age: " + this.age + ". Height: " + this.height + ".Genre: " +
                this.genre + ".Life level: " + this.lifeLevel + ". Tool: " +
                this.tool + ".";
    }
}
