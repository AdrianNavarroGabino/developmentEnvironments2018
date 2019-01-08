// Adrián Navarro Gabino

import java.util.*;

public class WaitApp
{
    public static void waitSeconds(int seconds) throws InterruptedException
    {
        Thread.sleep(seconds * 1000);
    }
    
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many seconds?");
        int seconds = sc.nextInt();
        
        try
        {
            waitSeconds(seconds);
        }
        catch(InterruptedException e)
        {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
