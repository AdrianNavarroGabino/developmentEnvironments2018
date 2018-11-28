/*Create a program called SumDigits that asks the user to enter numbers (integer 
values) until he enters 0. The program must sum up all the numbers entered by
the user and then show the final result, and how many digits it has. For 
instance, if the user types 12, 20, 60, 33, 99 and 0, then the program must 
output: "The result is 224, and it has 3 digits".
*/

// Adrián Navarro Gabino

import java.util.*;

public class SumDigits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int number;
        int sum = 0;
        int count = 0;
        
        do
        {
            System.out.println("Enter a number (0 to exit):");
            number = sc.nextInt();
            
            sum += number;
        } while(number != 0);
        
        System.out.println("The total amount is " + sum);
        
        while(sum != 0)
        {
            sum /= 10;
            count++;
        }
        
        System.out.println("It has " + count + " digits");
    }
}
