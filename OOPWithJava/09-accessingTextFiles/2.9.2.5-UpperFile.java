// Adrián Navarro Gabino

import java.io.*;
import java.util.*;

class UpperFile {
    public static void main( String[] args ) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String filename = sc.nextLine();
        
        if (! (new File(filename)).exists() ) {
            System.out.println("File " + filename + " not found");
            return;
        }
        
        PrintWriter printWriter = null;
        
        try {
            BufferedReader inputFile = new BufferedReader(
                new FileReader(new File(filename)));
            
            printWriter = new PrintWriter(
                    new BufferedWriter(new FileWriter(
                    filename + ".upper.txt",true)));
                
            String line = inputFile.readLine();
            while (line != null) {
                printWriter.println(line.toUpperCase());
                line = inputFile.readLine();
            }
            
            printWriter.close();
            inputFile.close();
            
            System.out.println("File copied.");
        }
        catch (IOException fileError) {
            System.out.println(
                "There has been some problems: " +
                fileError.getMessage() );
        }
    }
}
