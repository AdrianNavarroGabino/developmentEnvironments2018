/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movielist;

import java.util.*;

/**
 *
 * @author Adrián Navarro Gabino
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Aquaman", 2018, "action"));
        movies.add(new Movie("Pitch Black", 2000, "horror"));
        movies.add(new Movie("Pacific Rim", 2013, "sci-fi"));
        
        Collections.sort(movies,
            (m1,m2) -> m1.getTitle().compareTo(m2.getTitle()) );
        
        for(Movie m: movies)
        {
            System.out.println(m);
        }
        System.out.println();
        
        Collections.sort(movies,
            (m1,m2) -> Integer.compare(m2.getReleaseYear(), m2.getReleaseYear()));
        
        for(Movie m: movies)
        {
            System.out.println(m);
        }
    }
    
}
