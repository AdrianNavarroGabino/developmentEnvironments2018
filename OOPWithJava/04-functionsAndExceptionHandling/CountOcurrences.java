// Adrián Navarro Gabino

public class CountOcurrences
{
    public static boolean countString(String a, String b, int n)
    {
        int count = 0;
        
        while(a.contains(b))
        {
            a = a.replaceFirst(b, "");
            count++;
        }
        
        return count == n;
    }
    
    public static void main(String[] args)
    {
        String a = "This string is just a sample string";
        
        String b = "string";
        
        int n = 2;
        
        System.out.println(countString(a, b, n));
    }
}
