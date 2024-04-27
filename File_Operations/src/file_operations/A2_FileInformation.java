/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package file_operations;
import java.io.*;
/**
 *
 * @author mehak
 */
public class A2_FileInformation {
 
    public static void main(String[] args) {
        String file="/home/mehak/Documents/Job/New-Job-Preparation/JAVA-Practice/File-Operation/A1";
        File f1=new File(file);
        
        if(f1.exists())
        {
            System.out.println("Name of the file is "+f1.getName());
            System.out.println("Absolute path is "+f1.getPath());
            System.out.println("Is Readable "+ f1.canRead());
            System.out.println("Is Writable "+f1.canWrite());
            System.out.println("Size in bits "+f1.length());
           
        }
        else
        {
            System.out.println("File does not exist ");
        }
    }
    
    
}
