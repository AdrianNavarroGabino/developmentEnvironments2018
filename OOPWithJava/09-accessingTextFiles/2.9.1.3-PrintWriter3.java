// Adrián Navarro Gabino

import java.io.*;
import java.util.*;

public class PrintWriter3
{
    public static void main(String[] args)
    {
        PrintWriter printWriter = null;
        Scanner sc = new Scanner(System.in);
        
        try {
                printWriter = new PrintWriter(
                    new BufferedWriter(new FileWriter("annotations.txt",true)));
                String sentence;
                do
                {
                    System.out.println("Enter a sentence:");
                    sentence = sc.nextLine();
                    
                    if(!sentence.equals(""))
                        printWriter.println(sentence);
                } while(!sentence.equals(""));
        }catch (IOException e) {
                e.printStackTrace();
        }finally {
            if (printWriter != null)
            {
                printWriter.close();
            }
        }
    }
}
