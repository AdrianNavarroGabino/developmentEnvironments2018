// Adrián Navarro Gabino

import java.util.*;

public class VideoGameList
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        VideoGame[] games = new VideoGame[5];
        
        for(int i = 0; i < 5; i++)
        {
            System.out.print("Enter the name of the game #" + (i + 1) +
                ": ");
            String newTitle = sc.nextLine();
            
            System.out.print("Enter the genre of the game #" + (i + 1) +
                ": ");
            String newGenre = sc.nextLine();
            
            System.out.print("Enter the price of the game #" + (i + 1) +
                ": ");
            double newPrice = sc.nextDouble();
            sc.nextLine();
            
            games[i] = new VideoGame(newTitle, newGenre, newPrice);
            
            System.out.println();
        }
        
        int cheapest = 0;
        int mostExpensive = 0;
        
        for(int i = 1; i < 5; i++)
        {
            if(games[i].getPrice() < games[cheapest].getPrice())
            {
                cheapest = i;
            }
            
            if(games[i].getPrice() > games[mostExpensive].getPrice())
            {
                mostExpensive = i;
            }
        }
        
        System.out.println("The cheapest game is: " +
            games[cheapest].getTitle());
        
        System.out.println("The most expensive game is: " +
            games[mostExpensive].getTitle());
    }
}

class VideoGame
{
    private String title;
    private String genre;
    private double price;
    
    public void setTitle(String newTitle) { title = newTitle; }
    public void setGenre(String newGenre) { genre = newGenre; }
    public void setPrice(double newPrice) { price = newPrice; }
    
    public String getTitle() { return title; }
    public String getGenre() { return genre; }
    public double getPrice() { return price; }
    
    public VideoGame(String newTitle, String newGenre, double newPrice)
    {
        setTitle(newTitle);
        setGenre(newGenre);
        setPrice(newPrice);
    }
}
