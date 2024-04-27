package inputoutput.InputStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class A10_BufferedReader {
    public static void main(String[] args) {
        String filePath = "/home/mehak/Documents/Job/New-Job-Preparation/JAVA-Practice/readit2";

        try 
        {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
             
            String line = bufferedReader.readLine();
            System.out.println(line);
            
            while (line != null)
            {
                System.out.println(line);
//              Read the next line
                line = bufferedReader.readLine();
            }
        } 
        
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
