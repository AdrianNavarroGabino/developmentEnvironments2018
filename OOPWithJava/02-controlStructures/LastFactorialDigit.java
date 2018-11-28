// Adrián Navarro Gabino

import java.util.*;

public class LastFactorialDigit
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int cases;
        cases = sc.nextInt();
        int number;
        int factorial;
        
        for(int i = 0; i < cases; i++)
        {
            number = sc.nextInt();

            if(number == 0 || number == 1)
            {
                factorial = 1;
            }
            else if(number == 2)
            {
                factorial = 2;
            }
            else if(number == 3)
            {
                factorial = 6;
            }
            else if(number == 4)
            {
                factorial = 4;
            }
            else
            {
                factorial = 0;
            }
            
            System.out.println(factorial);
        }
    }
}
