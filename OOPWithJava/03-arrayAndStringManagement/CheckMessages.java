/*
Create a program called CheckMessages that asks the user to type 10 strings.
The program must store them in an array, and then replace the text "Eclipse"
with "NetBeans" in every string that contains "Eclipse". The program must output
the updated version of the strings stored in the array, once the replacement has
been done.
*/

// Adrián Navarro Gabino

import java.util.*;

public class CheckMessages
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        final int SIZE = 10;
        String[] data = new String[SIZE];
        
        for(int i = 0; i < SIZE; i++)
        {
            System.out.println("Enter sentence #" + (i+1));
            data[i] = sc.nextLine();
            data[i] = data[i].replaceAll("Eclipse","NetBeans");
        }
        
        System.out.println();
        
        for(int i = 0; i < SIZE; i++)
        {
            System.out.println("Sentence #" + (i+1));
            System.out.println(data[i]);
        }
    }
}
