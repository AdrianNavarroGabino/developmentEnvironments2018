// Adrián Navarro Gabino

public class Palindrome
{
    public static boolean isPalindrome(String entry)
    {
        entry = entry.toLowerCase().replaceAll(" ","");
        
        for(int i = 0; i < entry.length(); i++)
        {
            if(entry.charAt(i) != entry.charAt(entry.length() - 1 - i))
            {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args)
    {
        System.out.println(isPalindrome("Hannah"));
        
        System.out.println(isPalindrome("Too hot to hoot"));
        
        System.out.println(isPalindrome("Java is the best language"));
    }
}
