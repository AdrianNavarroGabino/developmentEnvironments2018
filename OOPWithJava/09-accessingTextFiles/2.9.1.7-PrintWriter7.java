// Adrián Navarro Gabino

import java.io.*;
import java.util.*;
import java.time.LocalDateTime;

public class PrintWriter7
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
                printWriter = new PrintWriter(name + "Calendar.txt");
                
                printWriter.println(name);
                printWriter.println();
                printWriter.println(" mon tue wed thu fri sat sun");
                printWriter.println();
                
                for(int i = 0; i < firstDay; i++)
                    printWriter.print("    ");
                
                int currentDay = firstDay;
                
                for(int i = 1; i < days; i++)
                {
                    switch(currentDay)
                    {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5: printWriter.printf(" %02d ", i); break;
                        case 6:
                            printWriter.printf(" %02d", i);
                            printWriter.println();
                            break;
                    }
                    
                    currentDay = (currentDay + 1) % 7;
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
