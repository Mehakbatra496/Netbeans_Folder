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
public class A6_StringArrayReader
{
    public static void main(String[] args) {
        String st="mhk";
        int data;
        
        try {
            StringReader sr=new StringReader(st);
            
            while((data=sr.read())!=-1)
            {
                System.out.println((char)data);
            }
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            
        }
    }
}
