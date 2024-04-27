/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inputoutput.InputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;

//import java.io.InputStream.*;
/**
 *
 * @author mehak
 */

public class B4_BufferedInputStream 
{
    public static void main(String[] args) 
    {
        String path="/home/mehak/Documents/Job/New-Job-Preparation/JAVA-Practice/readit2";
        int k=1;
        try {
                    FileInputStream fi=new FileInputStream(path);
                    BufferedInputStream bi=new BufferedInputStream(fi);
                    
                    int data=bi.read(); //first byte read
                    
                    while(data!=-1)
                    {
                        k=k+1;
                        System.out.println(data);
                        data=bi.read();
                        
                    }
                        System.out.println("Loop is "+k);

            } 
        
        catch (Exception e) 
             {
                 System.out.println(e.getMessage());
             }
        
    }
}
