// Adrián Navarro Gabino

import java.util.*;

public class ThreeFingersInEachHand
{
    public static String base3(int n)
    {
        if(n < 6)
        {
            return "" + n;
        }
        
        int x = n % 6;
        return base3(n / 6) + x;
    }
    
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        
        for(int i = 0; i < cases; i++)
        {
            int number = sc.nextInt();
            System.out.println(base3(number));
        }
    }
}
