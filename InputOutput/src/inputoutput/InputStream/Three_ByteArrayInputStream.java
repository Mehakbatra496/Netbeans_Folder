/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inputoutput.InputStream;
import java.io.ByteArrayInputStream;
/**
 *
 * @author mehak
 */
public class Three_ByteArrayInputStream {
    public static void main(String[] args)
    {
        int data;
        byte[] arr = { 48,49,97,98 };
            ByteArrayInputStream by=new ByteArrayInputStream(arr);
            
//           System.out.println(by.read()); 
           
         while ((data = by.read()) != -1)
            {
                System.out.print((char) data);
            }
            
            
    }
    
}


