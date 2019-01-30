/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videogames;

/**
 *
 * @author adnag
 */
public class VideoGames {

    protected String title;
    protected String genre;
    protected double price;

    public VideoGames(String title, String genre, double price) {
        this.title = title;
        this.genre = genre;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "VideoGames{" + "title=" + title + ", genre=" + genre + ", price=" + price + '}';
    }
}
