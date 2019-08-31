package accomodationmanagement.types;

/**
 *
 * @author Adrian Navarro Gabino
 */
public class AccomodationFactory {
    
    public static Accomodation getAccomodation(String accomodationType,
            String name, int pricePerNight, int hotelRating,
            boolean swimmingPull) {
        
        if(accomodationType.equalsIgnoreCase("Hotel")) {
            
            return new Hotel(name, pricePerNight, hotelRating, swimmingPull);
        }
        else {
            
            return null;
        }
    }
    
    public static Accomodation getAccomodation(String accomodationType,
            String name, int pricePerNight, int maxNumberOfPeople,
            int numberOfRooms) {
        
        if(accomodationType.equalsIgnoreCase("RuralHouse")) {
            
            return new RuralHouse(name, pricePerNight, maxNumberOfPeople,
                    numberOfRooms);
        }
        else {
            
            return null;
        }
    }
}
