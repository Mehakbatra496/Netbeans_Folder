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
public class A4_RuntimeException {
    
    public static void main(String[] args) {
        
        String path="/home/abc.txt";
        
        try {
        
        FileInputStream fs=new FileInputStream(path);
        
        System.out.println(fs.read());        
            
        } catch (Exception e) {
        }
        
        A4_RuntimeException a4=new A4_RuntimeException();
        a4.run();
      
    }
    
      
      void run()
        {
        System.out.println("Print even file not found");
            
        }
    
}

