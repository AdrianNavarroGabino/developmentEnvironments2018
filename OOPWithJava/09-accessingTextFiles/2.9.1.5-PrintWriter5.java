// Adrián Navarro Gabino

import java.io.*;
import java.util.*;
import java.time.LocalDateTime;

public class PrintWriter5
{
    public static void main(String[] args)
    {
        PrintWriter printWriter = null;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Height: ");
        int height = sc.nextInt();
        System.out.print("Width: ");
        int width = sc.nextInt();
        
        try {
                printWriter = new PrintWriter("rectangle.txt");
                
                for(int i = 0; i < height; i++)
                {
                    for(int j = 0; j < width; j++)
                    {
                        printWriter.print("*");
                    }
                    printWriter.println();
                }
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
