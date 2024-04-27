/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inputoutput.Outputstream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mehak
 */
public class A1_FileOutputStream
{
    public static void main(String[] args)
    {
        
       String path="/home/mehak/Documents/Job/New-Job-Preparation/JAVA-Practice/mhksh";
       int data;
       byte[] arr={6,23,47,99};
       byte[] srr=new byte[100];
       String st="Mehak Batra";    
       srr=st.getBytes();
       
       
       
           try {
                    FileOutputStream fo=new FileOutputStream(path);

                    fo.write(arr);
                     
                    FileInputStream fi=new FileInputStream(path);
                    
                    while((data=fi.read())!=-1)
                    System.out.println(data); //converted to chracter from ascii
                    
                } 
            catch (IOException ex)
            {
                System.out.println("error "+ex.getMessage());
        }
       
    }
}
