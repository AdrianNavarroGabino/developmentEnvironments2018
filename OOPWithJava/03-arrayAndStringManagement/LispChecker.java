/*
Create a program called LispChecker. LISP is a programming languages where
every instruction is enclosed in parentheses. This could be a set of 
instructions in LISP:
    (let ((new (x-point a y))))
You must implement a program that takes a string with LISP instructions (just 
one string) and then check if the parentheses are correct (this is, the number 
of opening parentheses and closing parentheses are the same).
*/

// Adrián Navarro Gabino

import java.util.*;

public class LispChecker
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a LISP instruction:");
        String LISPInstruction = sc.nextLine();
        
        int countLeftParenthesis = 0;
        int countRightParenthesis = 0;
        boolean correctParenthesis = true;
        
        for(int i = 0; i < LISPInstruction.length(); i++)
        {
            if(LISPInstruction.charAt(i) == '(')
            {
                countLeftParenthesis++;
            }
            
            if(LISPInstruction.charAt(i) == ')')
            {
                countRightParenthesis++;
                
                if(countRightParenthesis > countLeftParenthesis)
                {
                    correctParenthesis = false;
                }
            }
        }
        
        if(countRightParenthesis == countLeftParenthesis && correctParenthesis)
        {
            System.out.println("Parentheses are correct");
        }
        else
        {
            System.out.println("Parentheses are NOT correct");
        }
    }
}
