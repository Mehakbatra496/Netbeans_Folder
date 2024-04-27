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
public class A5_CharArrayReader
{
    public static void main(String[] args)
    {
            char[] ch={'A','B','C','D','E','7'};
            int data;
            
            try {
            
       
            CharArrayReader cr=new CharArrayReader(ch);

                    while((data=cr.read())!=-1)
                    {
                        System.out.println((char)data);
                    }
                                    System.out.println(cr.ready());

             } catch (Exception e) {
        }
    }
}