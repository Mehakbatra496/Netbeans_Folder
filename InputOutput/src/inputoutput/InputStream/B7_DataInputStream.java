/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inputoutput.InputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.InputStream.*;
import java.io.OutputStream.*;
import java.io.*;

/**
 *
 * @author mehak
 * 
 */
public class B7_DataInputStream
{
    public static void main(String[] args) {
        
      String path=  "/home/mehak/Documents/Job/New-Job-Preparation/JAVA-Practice/ReadIt6";
      
        try {
//                    int k=writeInFile(path);
                    
                    if(writeInFile(path))
                    {
                        
                       System.out.println("Data written successfully ");
  
                    }
                    
                    FileInputStream fi=new FileInputStream(path);
                    DataInputStream di=new DataInputStream(fi);
                    
                    int intValue = di.readInt();
                    double doubleValue = di.readDouble();
            
                    System.out.println("Integer value is "+intValue);
                    System.out.println("Float is "+doubleValue);  
                                                                                  
        } 
        
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
        
    }
    
    private static boolean writeInFile(String filepath)
    {
        try {
                    FileOutputStream fo=new FileOutputStream(filepath);
                    
                    DataOutputStream dot=new DataOutputStream(fo);
                    
                    dot.writeInt(21);
                    dot.writeDouble(25.45);
                    
                    return true;
                    
        } catch (Exception e) {
            System.out.println("error "+e.getMessage());
            return false;
        }
    }
}



