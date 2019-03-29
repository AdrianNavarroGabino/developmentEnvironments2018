// Adrián Navarro Gabino

import java.io.*;
import java.util.*;

class ShowFile {
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
            BufferedReader inputFile = new BufferedReader(
                new FileReader(new File(filename)));
                
            String line = inputFile.readLine();
            while (line != null) {
                System.out.println(line);
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
