/*
Create a program called CircleArea that defines a float constant called PI with
the value 3.14159 . Then, the program will ask the user to enter the radius of a
circle, and it will output the area of the circle ( PI * radius * radius).
This area will be printed with two decimal digits.
*/

// Adrián Navarro Gabino
 

import java.util.*;

public class CircleArea
{
    public static final float PI = 3.14159f;
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the radius of a circle:");
        float radius = sc.nextFloat();
        
        double area = PI * Math.pow(radius,2);
        
        System.out.printf("Area: %.2f", area);
    }
}
