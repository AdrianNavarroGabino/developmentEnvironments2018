/*
Create a program called FormattedDate with a class with the same name inside.
The program will asks the user to enter the day, month and year of birth (all
values are integers). Then, it will print his birth date with the format d/m/y.
For instance, if the user types day = 7, month = 11, year = 1990, the program
will output 7/11/1990.
*/

// Adrián Navarro Gabino
  

import java.util.*;

public class FormattedDate
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int birthDay, birthMonth, birthYear;
        
        System.out.println("Enter the day of your birth:");
        birthDay = sc.nextInt();
        System.out.println("Enter the month of your birth:");
        birthMonth = sc.nextInt();
        System.out.println("Enter the year of your birth:");
        birthYear = sc.nextInt();
        
        System.out.printf("%02d/%02d/%04d", birthDay, birthMonth, birthYear);
    }
}
