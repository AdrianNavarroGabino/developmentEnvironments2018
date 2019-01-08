// Adrián Navarro Gabino

import java.util.*;

public class ExceptionTest
{
    public static void a() throws InterruptedException
    {
        throw new InterruptedException("Exception in a");
    }
    
    public static void b() throws InterruptedException
    {
        a();
    }
    
    public static void c() throws InterruptedException
    {
        b();
    }
    
    
    public static void main(String[] args)
    {
        try
        {
            c();
        }
        catch(InterruptedException e)
        {
        }
    }
}
