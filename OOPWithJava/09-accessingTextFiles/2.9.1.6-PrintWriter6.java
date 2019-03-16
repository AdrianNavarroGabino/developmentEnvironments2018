// Adrián Navarro Gabino

import java.io.*;
import java.util.*;
import java.time.LocalDateTime;

public class PrintWriter6
{
    public static void main(String[] args)
    {
        PrintWriter printWriter = null;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Number of days: ");
        int days = sc.nextInt();
        sc.nextLine();
        System.out.print("Name of the month: ");
        String name = sc.nextLine();
        System.out.print("Number of the first day in the month: ");
        int firstDay = sc.nextInt() - 1;
        
        try {
                printWriter = new PrintWriter(name + ".txt");
                
                printWriter.println(name);
                printWriter.println("----------------------------------------");
                
                int currentDay = firstDay;
                
                for(int i = 1; i < days; i++)
                {
                    switch(currentDay)
                    {
                        case 0: printWriter.print("Monday "); break;
                        case 1: printWriter.print("Tuesday "); break;
                        case 2: printWriter.print("Wednesday "); break;
                        case 3: printWriter.print("Thursday "); break;
                        case 4: printWriter.print("Friday "); break;
                        case 5: printWriter.print("Saturday "); break;
                        case 6: printWriter.print("Sunday "); break;
                    }
                    
                    currentDay = (currentDay + 1) % 7;
                    
                    printWriter.println(i);
                    printWriter.println("----------------------------------------");
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
