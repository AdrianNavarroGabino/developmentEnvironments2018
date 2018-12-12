// Adrián Navarro Gabino

import java.util.*;

public class Lullaby
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine())
        {
            String word = sc.nextLine();
            
            int position = 0;
            boolean notRepeated = true;
            String syllable;
            
            for(int i = position + 1; i < word.length(); i++)
            {
                notRepeated = true;
                syllable = word.substring(0,position+1);
                for(int j = position + 1; j < word.length(); j++)
                {
                    if(!syllable.equalsIgnoreCase(word.substring(j,position+1)))
                    {
                        notRepeated = false;
                        break;
                    }
                }
                if(!notRepeated)
                {
                    position++;
                }
                else
                {
                    break;
                }
            }
            
            System.out.println(position-1);
        }
    }
}
