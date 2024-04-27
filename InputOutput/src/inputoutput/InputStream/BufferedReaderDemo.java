/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inputoutput.InputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.FilterOutputStream;



/**
 *
 * @author mehak
 */
public class BufferedReaderDemo {
    
    public static void main(String[] args) {
        
     try
        {
//            InputStreamReader isr=new InputStreamReader(System.in);
//            BufferedReader br=new BufferedReader(isr);
            
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));         FileOutputStream fo=new FileOutputStream("/home/mehak/Documents/Job/New-Job-Preparation/JAVA-Practice/readit");
            
            
           
           
            System.out.println("Enter Name : ");
            //int i=br.read();
            String s=br.readLine();
            
            byte[] barray= s.getBytes() ;   
            
            
            
            fo.write(barray);
//            System.out.println(s);
            
            br.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
     
    }
}
