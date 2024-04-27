/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inputoutput.InputStream;
import java.io.InputStreamReader;
import java.io.*;
/**
 *
 * @author mehak
 */
public class A8_InputStreamReader {
    
    public static void main(String[] args) {
        
        char[] arr=new char[50];
        try {
            
        
                FileInputStream fi=new FileInputStream("/home/mehak/Documents/Job/New-Job-Preparation/JAVA-Practice/readit2");

                InputStreamReader ir=new InputStreamReader(fi);

                ir.read(arr);
                System.out.println(arr);  



        } 
        
        catch (Exception e) 
        {
            
            System.out.println("Error...."+e.getMessage());
        }
        
        
        
    }
    
}
