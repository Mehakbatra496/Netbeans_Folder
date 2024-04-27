/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inputoutput.InputStream;
import java.io.FileOutputStream;
/**
 *
 * @author mehak
 */
public class Four_FileOutputStream {
      public static void main(String[] args) 
      {
        
                String str="My name is mhk";
                byte[] arr=str.getBytes();

                try {           

                FileOutputStream fo=new FileOutputStream("/home/mehak/Documents/Job/New-Job-Preparation/JAVA-Practice/readit",true);

             fo.write(arr);
             fo.flush();
        } 
        
        catch (Exception e)
        {
                System.out.println("error "+e.getMessage());
        }
        
        
    }
}
