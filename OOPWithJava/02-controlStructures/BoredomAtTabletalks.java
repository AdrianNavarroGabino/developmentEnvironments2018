// Adrián Navarro Gabino

import java.util.*;

public class BoredomAtTabletalks
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int rows;
        int toothpick;
        
        do
        {
            rows = sc.nextInt();
            
            if(rows != 0)
            {
                toothpick = (rows * (rows + 1) / 2) * 3;
                
                System.out.println(toothpick);
            }
        } while(rows != 0);
    }
}
