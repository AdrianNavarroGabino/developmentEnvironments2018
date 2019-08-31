// Adrián Navarro Gabino

package access;

import java.util.HashMap;
import java.util.Map;

public class Access 
{
    Map<String, String> users;
    
    public Access()
    {
        users = new HashMap<>();
    }
    
    public boolean validUser(String user, String pass)
    {
        boolean result = true;
        char firstLetter;
        
        if (user != null)
        {
            firstLetter = user.toUpperCase().charAt(0);
            if (user.length() < 7 || user.length() > 10 || 
                firstLetter < 'A' || firstLetter > 'Z')
                result = false;
            
            else if (pass != null)
            {
                if (pass.length() < 10 || !containsCharBetween(pass, 'A', 'Z') || 
                    !containsCharBetween(pass, '0', '9'))
                    result = false;
            } else {
                result = false;
            }
        } else {
            result = false;
        }
        
        return result;
    }
    
    public boolean register(String user, String pass) 
    {
        boolean result;
        if (users.size() == 10 || users.get(user) != null)
            result = false;
        else {
            users.put(user, pass);
            result = true;
        }
        
        return result;
    }
    
    private boolean containsCharBetween(String text, char min, char max)
    {
        boolean result = false;
        int index = 0;
                
        while (!result && index < text.length())
        {
            if (text.toUpperCase().charAt(index) >= min && 
                text.toUpperCase().charAt(index) <= max)
                result = true;
            
            index++;                    
        }
                
        return result;
    }
}
