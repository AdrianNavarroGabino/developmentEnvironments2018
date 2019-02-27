/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * @author Adrián Navarro Gabino
 */
public class Hotels
{
    public static void main(String[] args)
    {
        List<Hotel> hotels = new ArrayList<>();
        hotels.add(new Hotel("Hotel Eurostars Lucentum", "Alicante", 4.2f));
        hotels.add(new Hotel("Rafaelhoteles Atocha", "Madrid", 4f));
        hotels.add(new Hotel("Hotel Maya Alicante", "Alicante", 2.8f));
        hotels.add(new Hotel("Sercotel Hotel Spa Porta Maris", "Alicante", 5f));
        hotels.add(new Hotel("Hotel Zaragoza Royal", "Zaragoza", 3.3f));
        
        Collections.sort(hotels,
            (h1,h2) -> Float.compare(h2.getRating(), h1.getRating()) );
        
        for(Hotel h: hotels)
            System.out.println(h);
        System.out.println();
        
        List<Hotel> bestHotels =
            hotels.stream()
                  .filter(h -> h.getRating() > 3)
                  .collect(Collectors.toList());
        
        for(Hotel h: bestHotels)
            System.out.println(h);
        System.out.println();
        
        hotels.stream()
              .filter(h -> h.getRating() > 3)
              .forEach(h -> System.out.println(h));
        System.out.println();
        
        String hotelNames =
            hotels.stream()
                  .filter(h -> h.getLocation().equalsIgnoreCase("Alicante"))
                  .map(h -> h.getName())
                  .collect(Collectors.joining(",", "", ""));
        
        System.out.println(hotelNames);
        System.out.println();
        
        long numberOfBestHotels =
                hotels.stream()
                      .filter(h -> h.getRating() == 5)
                      .count();
        System.out.println("Hotels whose rating is 5: " + numberOfBestHotels);
    }
}
