/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adrián Navarro Gabino
 */
public class Hotel
{
    protected String name;
    protected String location;
    protected float rating;

    public Hotel(String name, String location, float rating) {
        this.name = name;
        this.location = location;
        this.rating = rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public float getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Hotel: " + name + ", location: " + location + ", rating: " +
                rating + '}';
    }
    
    
}
