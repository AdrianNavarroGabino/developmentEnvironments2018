package accomodationmanagement.main;

import accomodationmanagement.types.Accomodation;
import accomodationmanagement.types.Hotel;
import accomodationmanagement.types.RuralHouse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Adrián Navarro Gabino
 */
public class AccomodationManagement {
    
    static Scanner sc = new Scanner(System.in);
    

    public static int askRating() {
        
        int rating = -1;
        
        while(rating == -1) {
            
            try {
                
                System.out.print("Enter a rating: ");
                rating = Integer.parseInt(sc.nextLine());
                
                if(rating < 1 || rating > 5) {
                    
                    System.out.println(
                            "Rating must be a number between 1 and 5");
                    rating = -1;
                }
            }
            catch(NumberFormatException ex) {
                
                System.out.println("Rating must be an integer number");
            }
        }
        
        return rating;
    }
    
    public static int askPricePerNight() {
        
        int pricePerNight = -1;
        
        while(pricePerNight == -1) {
            
            try {
                
                System.out.print("Enter a price per night: ");
                pricePerNight = Integer.parseInt(sc.nextLine());
                
                if(pricePerNight < 0) {
                    
                    System.out.println(
                            "Price per night must be a positive number");
                    pricePerNight = -1;
                }
            }
            catch(NumberFormatException ex) {
                
                System.out.println("Price per night must be an integer number");
            }
        }
        
        return pricePerNight;
    }
    
    
    public static void main(String[] args) {
        
        AccomodationManager manager =
                AccomodationManager.getAccomodationManager();
        manager.readAccomodations("accomodations.txt");
        
        int rating = askRating();
        
        List<Hotel> hotels = manager.searchByHotelRating(rating);
        
        System.out.println("Hotels whose rating is greater or equal than " +
                rating + "/5:");
        for(int i = 0; i < hotels.size(); i++) {
            
            System.out.println(hotels.get(i));
        }
        
        int pricePerNight = askPricePerNight();
        
        List<Accomodation> cheapAccomodations =
                manager.searchByPrice(pricePerNight);
        
        System.out.println(
                "Hotels whose price per night is lower or equal than " +
                pricePerNight + "€:");
        for(int i = 0; i < cheapAccomodations.size(); i++) {
            
            if(cheapAccomodations.get(i) instanceof Hotel) {
                
                System.out.println((Hotel) cheapAccomodations.get(i));
            }
            else if(cheapAccomodations.get(i) instanceof RuralHouse) {
                
                System.out.println((RuralHouse) cheapAccomodations.get(i));
            }
        }
    }
    
}
