import java.io.*;

class ReadingTwoSentences {
    public static void main( String[] args ) {
        
        if (! (new File("twoSentences.txt")).exists() ) {
            System.out.println("File twoSentences.txt not found");
            return;
        }
        
        System.out.println("Reading file...");
        
        try {
            BufferedReader inputFile = new BufferedReader(
                new FileReader(new File("twoSentences.txt")));
            
            int count = 0;
                
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
