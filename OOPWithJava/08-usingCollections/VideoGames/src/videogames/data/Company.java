package videogames.data;

/**
 *
 * @author Adrián Navarro Gabino
 */
public class Company 
{
    private String name;
    private int yearOfFundation;

    public Company(String name, int yearOfFundation) {
        this.name = name;
        this.yearOfFundation = yearOfFundation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfFundation() {
        return yearOfFundation;
    }

    public void setYearOfFundation(int yearOfFundation) {
        this.yearOfFundation = yearOfFundation;
    }
}
