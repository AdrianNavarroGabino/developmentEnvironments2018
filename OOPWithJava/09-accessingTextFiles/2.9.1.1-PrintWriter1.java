// Adrián Navarro Gabino

import java.io.*;
import java.util.*;

public class PrintWriter1
{
    public static void main(String[] args)
    {
        PrintWriter printWriter = null;
        Scanner sc = new Scanner(System.in);
        
        try {
                printWriter = new PrintWriter ("twoSentences.txt");
                System.out.println("Enter a sentence:");
                printWriter.println (sc.nextLine());
                System.out.println("Enter another sentence:");
                printWriter.println (sc.nextLine());
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
