package accomodationmanagement.types;

/**
 *
 * @author Adrián Navarro Gabino
 */
public class RuralHouse extends Accomodation {
    
    private int maxNumberOfPeople;
    private int numberOfRooms;

    public RuralHouse(String name, int pricePerNight, int maxNumberOfPeople,
            int numberOfRooms) {
        
        super(name, pricePerNight);
        this.maxNumberOfPeople = maxNumberOfPeople;
        this.numberOfRooms = numberOfRooms;
    }

    public int getMaxNumberOfPeople() {
        
        return maxNumberOfPeople;
    }

    public int getNumberOfRooms() {
        
        return numberOfRooms;
    }

    @Override
    public String toString() {
        
        return "Rural house: " + super.toString() +
                ", maximum number of people: " + maxNumberOfPeople +
                ", number of rooms: " + numberOfRooms;
    }
}
