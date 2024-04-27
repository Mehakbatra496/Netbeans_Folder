/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package file_operations;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author mehak
 */
public class A5_ReadByScanner
{
    public static void main(String[] args) 
    {
        String file="/home/mehak/Documents/Job/New-Job-Preparation/JAVA-Practice/File-Operation/A1";
        int data;
            try{
               
                File fr=new File(file);
               
                Scanner sc=new Scanner(fr);
                
                while (sc.hasNextLine()) 
                {
                    String st=sc.nextLine();
                    System.out.println(st);                    
                }
                long l=fr.length();
        System.out.println("Length "+l);
        
        long ll=fr.lastModified();
        System.out.println(ll);
        
        System.out.println(fr.isFile());
                
                sc.close();
            }
            catch(Exception e)
            {

            }                     
    }
    
}
