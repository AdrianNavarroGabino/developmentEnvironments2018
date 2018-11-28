/*
Create a program called GramOunceConverter that will be an improved version of 
exercise 2.1.6.2. of previous unit. In this case, the user will type a weight 
(float), and a unit ( g for grams, o for ounces). Then, depending on the unit 
chosen, the program will convert the weight to the opposite unit. For instance, 
if the user types a weight of 33 and chooses o as unit, then the program must 
convert 33 ounces to grams. You must solve this program using a switch structure.
If the unit is other than g or o , then the program must output an error message:
"Unexpected unit", with no final result.
*/

// Adrián Navarro Gabino 

import java.util.*;

public class GramOunceConverter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the weight");
        float weight = sc.nextFloat();
        System.out.println("Enter the units:");
        String unit = sc.next();
        
        switch(unit)
        {
            case "o": System.out.printf("%.2f grams.", weight * 28.3495); break;
            case "g": System.out.printf("%.2f ounces.", weight / 28.3495); break;
            default: System.out.println("Unexpected unit");
        }
    }
}
