/*
Create a program called NumbersStrings. This program must ask the user to enter
4 numbers, that will be stored in 4 String variables. Then, the program will
join the first pair of numbers into a single integer value, and the second pair
of numbers into another integer value, and then add these values. For instance,
if the user types the numbers 23, 11, 45 and 112, then the program will create a
first integer value of 2311 and a second integer value of 45112. Then, it will
add these two values and get a final result of 47423.
*/

// Adrián Navarro Gabino 

import java.util.*;

public class NumbersStrings
{
    public static void main(String[] args)
    {
        int sum;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first part of the first number:");
        String number11 = sc.nextLine();
        System.out.println("Enter the second part of the first number:");
        String number12 = sc.nextLine();
        
        System.out.println("Enter the first part of the second number:");
        String number21 = sc.nextLine();
        System.out.println("Enter the second part of the second number:");
        String number22 = sc.nextLine();
        
        sum = Integer.parseInt(number11 + number12) +
            Integer.parseInt(number21 + number22);
        
        System.out.println(number11 + number12 + " + " + number21 + number22 +
            " = " + sum);
    }
}
