// Adrián Navarro Gabino

import java.util.*;
import java.util.stream.Collectors;

public class LittlePots
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int cases;
        
        do
        {
            cases = sc.nextInt();
            sc.nextLine();
            
            Set<String> ingredientsOK = new HashSet<>();
            Set<String> ingredientsNotOK = new HashSet<>();
            
            for(int i = 0; i < cases; i++)
            {
                String[] littlePot = sc.nextLine().split(" ");
                if(littlePot[0].equalsIgnoreCase("NO:"))
                    for(int j = 1; j < littlePot.length - 1; j++)
                        ingredientsNotOK.add(littlePot[j]);
                else
                    for(int j = 1; j < littlePot.length - 1; j++)
                        ingredientsOK.add(littlePot[j]);
            }
            
            String result =
                ingredientsNotOK.stream()
                                .filter(ing -> !ingredientsOK.contains(ing))
                                .collect(Collectors.joining(" ", "", ""));
            System.out.println(result);
        }while(cases != 0);
    }
}
