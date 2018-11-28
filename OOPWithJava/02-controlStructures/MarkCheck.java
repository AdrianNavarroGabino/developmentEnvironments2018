/*
Create a program called MarkCheck that asks the user to enter 3 marks. The
program must print one of these messages, depending on the mark values:
    All marks are greater or equal than 4
    Some marks are not greater or equal than 4
    No mark is greater or equal than 4
*/

// Adrián Navarro Gabino 

import java.util.*;

public class MarkCheck
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first mark:");
        double mark1 = sc.nextDouble();
        System.out.println("Enter the second mark:");
        double mark2 = sc.nextDouble();
        System.out.println("Enter the third mark:");
        double mark3 = sc.nextDouble();
        
        if(mark1 >= 4 && mark2 >= 4 && mark3 >= 4)
        {
            System.out.println("All marks are greater or equal than 4");
        }
        else if(mark1 >= 4 || mark2 >= 4 || mark3 >= 4)
        {
            System.out.println("Some marks are not greater or equal than 4");
        }
        else
        {
            System.out.println("No mark is greater or equal than 4");
        }
    }
}
