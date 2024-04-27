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
public class A4_ReadFromFile 
{
    public static void main(String[] args) 
    {
        String file="/home/mehak/Documents/Job/New-Job-Preparation/JAVA-Practice/File-Operation/A1";
        int data;
            try{
               
                FileReader fr=new FileReader(file);
                while((data=fr.read())!=-1)
                {
                    System.out.print((char)data);
                }
            }
            catch(Exception e)
            {

            }                     
    }
    
}
