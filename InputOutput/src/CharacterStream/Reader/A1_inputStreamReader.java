/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CharacterStream.Reader;
import java.io.*;
import java.nio.charset.Charset;
/**
 *
 * @author mehak
 * 
 */
public class A1_inputStreamReader
{
    public static void main(String[] args)
    {
        String fpath="/home/mehak/Documents/Job/New-Job-Preparation/JAVA-Practice/IOFiles/write1";
        int data;
        char[] arr=new char[50];
        byte[] arr2=new byte[20];
        
        try {
            
        FileInputStream fi=new FileInputStream(fpath); //Read bytes
        InputStreamReader is= new InputStreamReader(fi,Charset.forName("UTF8")); //convert those bytes to characters.
        

//            while((data=is.read())!=-1)    // Oe way to read byte by byte and convert it
//            {
//                System.out.println((char)data);
//            }
              is.read(arr);                 // Another way to read in a char array
              System.out.println(arr);
              
//              for(int i=0; i<arr2.length; i++)

              
              System.out.println(is.getEncoding());
              
         } catch (Exception e) {
             System.out.println(e.getMessage());  
        }
       
    }
}
