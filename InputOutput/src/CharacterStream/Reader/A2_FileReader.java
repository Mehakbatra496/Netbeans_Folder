/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CharacterStream.Reader;
import java.io.*;
/**
 *
 * @author mehak
 */
public class A2_FileReader
{
    public static void main(String[] args)
    {
          String fpath="/home/mehak/Documents/Job/New-Job-Preparation/JAVA-Practice/IOFiles/write1";
          int data;
          try {
      
                FileReader fr=new FileReader(fpath);
                
                while((data=fr.read())!=-1)
                {
                    System.out.println((char)data);
                }

              }
          catch (Exception e)
             {
                 System.out.println(e.getMessage());
             }
          
    }
}
