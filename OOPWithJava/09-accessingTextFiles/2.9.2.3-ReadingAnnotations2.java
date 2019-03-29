// Adrián Navarro Gabino

import java.io.*;
import java.util.*;

class ReadingAnnotations2 {
    public static void main( String[] args ) {
        
        if (! (new File("annotations.txt")).exists() ) {
            System.out.println("File annotations.txt not found");
            return;
        }
        
        System.out.println("Reading file...");
        
        try {
            Scanner sc = new Scanner(System.in);
            
            BufferedReader inputFile = new BufferedReader(
                new FileReader(new File("annotations.txt")));
            
            int count = 0;
                
            String line = inputFile.readLine();
            while (line != null) {
                System.out.println(line);
                count++;
                if(count % 23 == 0)
                    sc.nextLine();
                    
                line = inputFile.readLine();
            }
            
            inputFile.close();
        }
        catch (IOException fileError) {
            System.out.println(
                "There has been some problems: " +
                fileError.getMessage() );
        }
        
        System.out.println("Reading finished.");
    }
}
