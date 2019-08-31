package accomodationmanagement.main;

import accomodationmanagement.types.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adrián Navarro Gabino
 */
public class AccomodationManager {
    
    private List<Accomodation> accomodations;
    private static AccomodationManager manager;

    private AccomodationManager() {
        
        accomodations = new ArrayList<>();
    }
    
    public static AccomodationManager getAccomodationManager() {
        
        if(manager == null) {
            
            manager = new AccomodationManager();
        }
        return manager;
    }
    
    private void addAccomodation(Accomodation newObject) {
        
        accomodations.add(newObject);
    }
    
    public void readAccomodations(String fileName) {
        
        Accomodation accomodation;
        
        if (! (new File(fileName)).exists() ) {
            
            System.out.println("File " + fileName + " not found");
            return;
        }
        
        try {
            BufferedReader inputFile = new BufferedReader(
                new FileReader(new File(fileName)));
            
            String line = inputFile.readLine();
            while (line != null) {
                
                if(line.split(";")[0].equals("Hotel")) {
            
                    accomodation = AccomodationFactory.getAccomodation(
                            "Hotel", line.split(";")[1],
                            Integer.parseInt(line.split(";")[2]),
                            Integer.parseInt(line.split(";")[3]),
                            line.split(";")[4].equalsIgnoreCase("YES"));
                }
                else {

                    accomodation = AccomodationFactory.getAccomodation(
                            "RuralHouse", line.split(";")[1],
                            Integer.parseInt(line.split(";")[2]),
                            Integer.parseInt(line.split(";")[3]),
                            Integer.parseInt(line.split(";")[4]));
                }

                addAccomodation(accomodation);
                
                line = inputFile.readLine();
            }
            
            inputFile.close();
        }
        catch (IOException fileError) {
            System.out.println(
                "There has been some problems: " +
                fileError.getMessage() );
        }
    }
    
    public List<Hotel> searchByHotelRating(int rating) {
        
        List<Hotel> hotels = new ArrayList<>();
        
        for(int i = 0; i < accomodations.size(); i++) {
            
            if(accomodations.get(i) instanceof Hotel &&
                    ((Hotel) accomodations.get(i)).getHotelRating() >= rating) {
                
                hotels.add((Hotel) accomodations.get(i));
            }
        }
        
        return hotels;
    }
    
    public List<Accomodation> searchByPrice(float price) {
        
        List<Accomodation> cheapAccomodations = new ArrayList<>();
        
        for(int i = 0; i < accomodations.size(); i++) {
            
            if(accomodations.get(i).getPricePerNight() <= price) {
                
                cheapAccomodations.add(accomodations.get(i));
            }
        }
        
        return cheapAccomodations;
    }
}
