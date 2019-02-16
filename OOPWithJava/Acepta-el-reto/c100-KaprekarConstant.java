// Adrián Navarro Gabino

import java.util.*;

public class KaprekarConstant
{
    public static final int KAPREKAR = 6174;
    
    public static int kaprekarSteps(int num)
    {
        int steps;
        
        if(num % 1111 == 0)
            steps = 8;
        else if(num == KAPREKAR)
            steps = 0;
        else
        {
            int[] digits = new int[4];
            int max = 0;
            int min = 0;
            
            for(int i = 0; i < 4; i++)
            {
                digits[i] = num / ((int)Math.pow(10, 3 - i));
                num %= (int)Math.pow(10, 3 - i);
            }
            
            sortNumber(digits);
            
            for(int i = 0; i < 4; i++)
                max += (digits[i] * (int)Math.pow(10, 3 - i));
            
            while(max < 1000)
                max *= 10;
            
            reverseNumber(digits);
            
            for(int i = 0; i < 4; i++)
                min += (digits[i] * Math.pow(10, 3 - i));
            
            int result = max - min;
            
            if(result == KAPREKAR)
                steps = 1;
            else
                steps = 1 + kaprekarSteps(result);
        }
        
        return steps;
    }
    
    public static void sortNumber(int[] digits)
    {
        for(int i = 0; i < 3; i++)
        {
            for(int j = i + 1; j < 4; j++)
            {
                if(digits[j] > digits[i])
                {
                    int aux = digits[i];
                    digits[i] = digits[j];
                    digits[j] = aux;
                }
            }
        }
    }
    
    public static void reverseNumber(int[] digits)
    {
        int[] aux = new int[4];
        
        for(int i = 0; i < 4; i++)
        {
            aux[i] = digits[i];
        }
        
        for(int i = 0; i < 4; i++)
        {
            digits[i] = aux[3 - i];
        }
    }
    
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int cases = sc.nextInt();
        
        for(int i = 0; i < cases; i++)
        {
            int number = sc.nextInt();
            
            System.out.println(kaprekarSteps(number));
        }
    }
}
