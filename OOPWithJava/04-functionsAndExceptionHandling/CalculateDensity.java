// Adrián Navarro Gabino

import java.util.*;

public class CalculateDensity
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        try
        {
            System.out.println("Enter weight:");
            String data = sc.nextLine();
            int weight = Integer.parseInt(data);
            
            System.out.println("Enter volume:");
            data = sc.nextLine();
            int volume = Integer.parseInt(data);
            
            double density = (double)weight / volume;
            
            System.out.println("Density: " + density);
        }
        catch(NumberFormatException e)
        {
            System.err.println("Error: " + e.getMessage());
        }
        catch(ArithmeticException e)
        {
            System.err.println("Can't divide by zero");
        }
    }
}
