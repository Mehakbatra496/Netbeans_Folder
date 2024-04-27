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
public class B6_CharArrayWriter {
    public static void main(String[] args) 
    {
        String str="Mehak Batra";
        char[] ch={'e','h','j','d','r','q','c'};
        int data;
        
        try {
                   
        CharArrayWriter cw=new CharArrayWriter(5);
                char[] arr=str.toCharArray();

        cw.write(str);
        cw.write(ch);
        cw.write(arr);
        cw.close();
        
        CharArrayReader cr=new CharArrayReader(arr);
        
        while((data=cr.read())!=-1)    
            {
                System.out.println((char)data);
            }
        
        

            } catch (Exception e)
            {
                
            }
    }
    
}
