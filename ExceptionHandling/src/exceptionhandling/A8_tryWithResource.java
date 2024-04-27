/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandling;
import java.io.*;
    
/**
 *
 * @author mehak
 */
public class A8_tryWithResource {
    
    public static void main(String[] args)
    {
              String file="/home/mehak/Documents/Job/New-Job-Preparation/JAVA-Practice/IOFiles/write9";

        try(FileWriter fw= new FileWriter(file))
        {
            fw.write('k');
        }
        catch(Exception e)
            {
                
            }
        
    }
    
}
