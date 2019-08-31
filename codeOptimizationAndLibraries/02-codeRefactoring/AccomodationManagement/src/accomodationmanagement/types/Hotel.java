package accomodationmanagement.types;

/**
 *
 * @author Adrián Navarro Gabino
 */
public class Hotel extends Accomodation {
    
    private int hotelRating;
    private boolean swimmingPool;

    public Hotel(String name, int pricePerNight, int hotelRating,
            boolean swimmingPool) {
        
        super(name, pricePerNight);
        this.hotelRating =
                hotelRating >= 1 ? (hotelRating <= 5 ? hotelRating : 5) : 1;
        this.swimmingPool = swimmingPool;
    }

    public int getHotelRating() {
        
        return hotelRating;
    }

    public boolean hasSwimmingPool() {
        
        return swimmingPool;
    }

    @Override
    public String toString() {
        
        return "Hotel: " + super.toString() + ", hotel rating:" + hotelRating +
                "/5, swimming pool? " + (swimmingPool ? "Yes" : "No");
    }
    
}
