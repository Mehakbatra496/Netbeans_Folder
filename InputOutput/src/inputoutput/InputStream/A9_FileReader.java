/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inputoutput.InputStream;
import java.io.*;
/**
 *
 * @author mehak
 */
public class A9_FileReader {
    
    public static void main(String[] args) 
    {
        
        try {
            
        
        String path="/home/mehak/Documents/Job/New-Job-Preparation/JAVA-Practice/readit2";
        
        FileReader fr=new FileReader(path);
//      FileInputStream fr=new FileInputStream(path);

        
        int abc;
        while((abc=fr.read())!=-1)
        {
            
//        System.out.println((char)fr.read());
                System.out.print((char)abc);
        

        
        }

    
        
        } catch (Exception e) {
                    System.out.println(e.getMessage());
        }
}
}