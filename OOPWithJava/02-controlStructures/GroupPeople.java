/*
Create a program called GroupPeople that asks the user to enter how many
people is going to attend to a conference. The program must create groups of
(preferably) 50 people. Whenever this is not possible, then it will attempt to 
create groups of 10 people, and finally it will create groups of 1 person. 
The program must output how many groups of each category are necessary. For 
instance, if 78 people are going to attend to the conference, then we need 1 
group of 50 people, 2 groups of 10 people and 8 groups of 1 people.
*/

// Adrián Navarro Gabino

import java.util.*;

public class GroupPeople
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many people is going to attend?");
        int people = sc.nextInt();
        
        int groupOf50 = 0;
        int groupOf10 = 0;
        int groupOf1 = 0;
        
        groupOf50 = people / 50;
        people %= 50;
    
        groupOf10 = people / 10;
        people %= 10;

        groupOf1 = people;

        
        System.out.printf("%d groups of 50 people", groupOf50);
        System.out.println();
        System.out.printf("%d groups of 10 people", groupOf10);
        System.out.println();
        System.out.printf("%d groups of 1 people", groupOf1);
        System.out.println();
    }
}
