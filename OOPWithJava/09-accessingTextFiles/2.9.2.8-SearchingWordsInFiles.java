// Adrián Navarro Gabino

import java.io.*;
import java.util.*;

class SearchingWordsInFiles {
    public static void main( String[] args ) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String filename = sc.nextLine();
        
        if (! (new File(filename)).exists() ) {
            System.out.println("File " + filename + " not found");
            return;
        }
        
        System.out.println("Reading file...");
        
        try {
            List<String> data = new ArrayList<>();
            
            BufferedReader inputFile = new BufferedReader(
                new FileReader(new File(filename)));
                
            String line = inputFile.readLine();
            while (line != null) {
                data.add(line);
                line = inputFile.readLine();
            }
            
            inputFile.close();
            
            String search;
            
            do
            {
                System.out.print("Enter word to search: ");
                search = sc.nextLine();
                boolean found = false;
                
                if(!search.equals(""))
                {
                    for(int i = 0; i < data.size(); i++)
                    {
                        if(data.get(i).contains(search))
                        {
                            System.out.println(data.get(i));
                            found = true;
                        }
                    }
                    
                    if(!found)
                    {
                        System.out.println("Not found");
                    }
                }
            } while(!search.equals(""));
        }
        catch (IOException fileError) {
            System.out.println(
                "There has been some problems: " +
                fileError.getMessage() );
        }
        
        System.out.println("Reading finished.");
    }
}
