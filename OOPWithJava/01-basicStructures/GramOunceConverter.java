/*
Create a program called GramOunceConverter that converts from grams to ounces.
The program will ask the user to enter a weight in grams (an integer number),
and then it will show the corresponding weight in ounces (a real number),
taking into account that 1 ounce = 28.3495 grams.
*/

// Adrián Navarro Gabino
 
import java.util.*;

public class GramOunceConverter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int grams;
        double ounces;
        
        System.out.println("Enter a weight in grams:");
        grams = sc.nextInt();
        
        ounces = grams / 28.3495;
        
        System.out.printf("%d grams: %.2f ounces.", grams, ounces);
    }
}
