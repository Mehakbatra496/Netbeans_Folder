/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CharacterStream.Writer;
import java.io.*;
/**
 *
 * @author mehak
 */
public class B5_PrintStream {
    
    public static void main(String[] args)
    {
        try {
 String file="/home/mehak/Documents/Job/New-Job-Preparation/JAVA-Practice/IO/Write6";
             String st="mhk print2";
             String name="Mehak";
             
             PrintStream ps=new PrintStream(file);
             
             ps.println(st); //Print into the file , not on console
             ps.println("Print it mhk");
             
             ps.printf("This is me %s ", name);
           
             
             //System.out.println(  ps.checkError());
             ps.close();
        } catch (Exception e) 
        {
            
        }
       
    }
    
}
