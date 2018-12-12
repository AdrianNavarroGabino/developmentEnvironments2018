/*
Create a program called SortJoin that asks the user to enter a list of names
separated by whitespaces. Then, the program must split the string, sort the 
names alphabetically and output them separated by commas. For instance, if the 
user types this name list: Susan Kailey William John , then the program must 
output John, Kailey, Susan, William .
*/

// Adrián Navarro Gabino

import java.util.*;

public class SortJoin
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a list of names separated by spaces:");
        String[] names = sc.nextLine().split(" ");
        
        String aux;
        
        for(int i = 0; i < names.length - 1; i++)
        {
            for(int j = i + 1; j < names.length; j++)
            {
                if(names[i].compareTo(names[j]) > 0)
                {
                    aux = names[i];
                    names[i] = names[j];
                    names[j] = aux;
                }
            }
        }
        
        for(int i = 0; i < names.length - 1; i++)
        {
            System.out.print(names[i] + ", ");
        }
        System.out.println(names[names.length - 1]);
    }
}
