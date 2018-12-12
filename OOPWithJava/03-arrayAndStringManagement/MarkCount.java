/*
Program that asks the user to enter 10 marks, and then it shows how many marks
of each category (from 0 to 10, inclusive) have been typed

We show here 3 possible solutions to this exercise, depending on which array(s)
we want to use
*/

// Adrián Navarro Gabino

import java.util.*;

public class MarkCount
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int count;
        final int SIZE = 10;
        
        int[] marks = new int[SIZE];
        
        for(int i = 0; i < SIZE; i++)
        {
            System.out.print("Enter mark #" + (i+1) + ": ");
            marks[i] = sc.nextInt();
        }
        
        for(int i = 1; i <= 10; i++)
        {
            count = 0;
            
            for(int j = 0; j < SIZE; j++)
            {
                if(marks[j] == i)
                {
                    count++;
                }
            }
            
            System.out.println(i + ": " + count + " marks");
        }
    }
}
