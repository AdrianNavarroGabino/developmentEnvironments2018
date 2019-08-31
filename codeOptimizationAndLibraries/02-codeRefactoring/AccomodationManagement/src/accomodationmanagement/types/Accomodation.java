package accomodationmanagement.types;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * <h1>Class Accomodation</h1>
 * Abstract class to define Accomodations with their names and prices per night
 * by the subclasses Hotel and RuralHouse.
 * @author Adrián Navarro Gabino
 * @version 1.0
 */
public abstract class Accomodation {
    
    protected String name;
    protected int pricePerNight;

    /**
     * Performs the initialization to the accomodation name and the accomodation
     * price per night before the instantiation of the subclasses takes place.
     * @param name Accomodation name
     * @param pricePerNight Accomodation price per night in euros
     */
    public Accomodation(String name, int pricePerNight) {
        
        this.name = name;
        this.pricePerNight = pricePerNight;
    }
    
    /**
     * Gets the accomodation name.
     * @return Accomodation name
     */
    public String getName() {
        
        return name;
    }
    
    /**
     * Gets the price per night.
     * @return Accomodation price per night
     */
    public int getPricePerNight() {
        
        return pricePerNight;
    }
    
    /**
     * Overrides toString method to get the accomodation data.
     * @return Accomodation data
     */
    @Override
    public String toString() {
        
        return "Name: " + name + ", price per night: " + pricePerNight;
    }

    /**
     * Gets the accomodation total price depending on the number of nights.
     * @param nights Number of nights
     * @return Total price
     */
    public int getTotal(int nights) {
        
        if(nights > 0 && pricePerNight > 0) {
            
            return nights * pricePerNight;
        }
        else {
            
            return -1;
        }
    }
    
    /**
     * Gets the accomodation check out date from the check in date and
     * the number of nights.
     * @param checkInDate Accomodation check in date
     * @param nights Number of night
     * @return Accomodation check out date
     */
    public static String getCheckOutDate(String checkInDate, int nights) {
        
        if(checkInDate.charAt(2) != '/' || checkInDate.charAt(5) != '/' ||
                checkInDate.length() != 10 || nights <= 0) {
            return null;
        }
        else {
            try {
                int checkInDay = Integer.parseInt(checkInDate.substring(0, 2));
                int checkInMonth = Integer.parseInt(checkInDate.substring(3,5));
                int checkInYear = Integer.parseInt(checkInDate.substring(6));
                
                if(checkInYear < 1000) {
                    return null;
                }
                else {
                    LocalDate checkIn = LocalDate.of(
                                        checkInYear, checkInMonth, checkInDay);

                    LocalDate checkOut = checkIn.plusDays(nights);

                    return checkOut.format(
                                    DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                }
            } catch(Exception ex) {

                return null;
            }
        }
    }
}
