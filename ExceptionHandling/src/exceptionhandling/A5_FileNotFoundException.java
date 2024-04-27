/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandling;
import java.io.*;

/** Unchecked 
 * 
 * @author mehak
 */
public class A5_FileNotFoundException {
    public static void main(String[] args) throws IOException    //IOException if the file does not have neccessary permission
    {
        A5_FileNotFoundException a5= new A5_FileNotFoundException();
        
        
        try 
            {            
                a5.callIt();

            } catch (Exception e)
            {
                System.out.println("Exception mhk...");
                
            }

        System.out.println("Print it in every situation ");
            
        
    }
    
    void callIt() throws FileNotFoundException, IOException
    {
        FileInputStream fi=new FileInputStream("");
        System.out.println(fi.read()); 
        
    }
    
    
    
}
