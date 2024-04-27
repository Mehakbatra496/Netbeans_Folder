

package CharacterStream.Reader;

/**
 *
 * @author mehak
 * 
 */
import java.io.FilterWriter;
import java.io.StringWriter;
import java.io.*;

public class B7_FilterWriter {

   public static void main(String[] args) throws Exception
   {
       String fpath = "/home/mehak/Documents/Job/New-Job-Preparation/JAVA-Practice/IOFiles/write7";
       String st="Mehak Batra";
       
       try {
           
           FileWriter fw=new FileWriter(fpath);
                 
           FilterWriter flw = new FilterWriter(fw) {};             
           flw.write(65);  
           fw.close();
           
           
           
           
       } catch (Exception e) {
       }


   }
}