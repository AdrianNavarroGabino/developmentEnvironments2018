package videogame.data;

/**
 *
 * @author Adrián Navarro Gabino
 */
public class Character {
    protected int age;
    protected int height;
    protected String genre;
    protected int lifeLevel;

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setLifeLevel(int lifeLevel) {
        this.lifeLevel = lifeLevel;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public String getGenre() {
        return genre;
    }

    public int getLifeLevel() {
        return lifeLevel;
    }

    public Character(int age, int height, String genre, int lifeLevel) {
        this.age = age;
        this.height = height;
        this.genre = genre;
        this.lifeLevel = lifeLevel;
    }
    
    @Override
    public String toString() {
        return "Age: " + this.age + ". Height: " + this.height + ".Genre: " +
                this.genre + ".Life level: " + this.lifeLevel + ".";
    }
}
