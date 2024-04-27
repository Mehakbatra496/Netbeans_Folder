/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inputoutput.InputStream;
import java.io.FileInputStream;

public class InputOutput2
{
    public static void main(String[] args) 
    {
        int i;
        
        try {
                   
        FileInputStream fs= new FileInputStream("/home/mehak/Documents/Job/New-Job-          Preparation/JAVA-Practice/readit");
        
        while((i=fs.read())!= -1)
        {
            System.out.println((char)i);
        }     
        
//         System.out.println("Available bytes at the beginning: " + fs.available());
//fs.close();
           fs.mark('i');

           System.out.println(fs.getFD());       

         }
        
        catch (Exception e)
         {
             System.out.println("error is "+e.getMessage());
         }
        
    }
}


