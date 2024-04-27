
//mhk program to read data byte by byte(as per the chracter ascii code) from the file and make an array and store those bytes and interpret them as String.

package inputoutput.InputStream;
import java.io.FileInputStream;
/**
 *
 * @author mehak
*/
public class Two_FileInputStream {
    
    public static void main(String[] args) throws Exception{ 
        
        FileInputStream fs=new FileInputStream("/home/mehak/Documents/Job/New-Job-Preparation/JAVA-Practice/readit2");
        
        
         byte[] arr=new byte[50];
         
//         System.out.println("Available bytes at the beginning: " + fs.available());

//         fs.skip(5);
      int data;
       while((data=fs.read(arr))!=-1)
        {
             
         System.out.print((char) data);
         String st=new String(arr);  //String constructor to convert bytes array to the string
         System.out.println(st);
         
        }      
       
//       System.out.println("Available bytes at the end: " + fs.available());
//       System.out.println(fs.getFD());  
         if (fs.markSupported()) 
                   {
             
                     System.out.println("mhk");
                   }
         
                   else
       System.out.println("no");
                 //Left characters to read from the file

    }
    
}



