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
public class A7_MultipleCatch 
{
    public static void main(String[] args) {
        
try 
{
    FileReader fr= new FileReader(" ");       
}


catch(ClassCastException | FileNotFoundException  f )
{
        System.out.println("Going to next...");

    f.printStackTrace();
}
  
    
 
catch(Exception e)
{
        System.out.println("I arrived..");

    e.printStackTrace();
}
    }

    
}
