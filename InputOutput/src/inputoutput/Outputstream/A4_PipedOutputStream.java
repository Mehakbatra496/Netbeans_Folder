/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inputoutput.Outputstream;
import java.io.*;
/**
 *
 * @author mehak
 */
public class A4_PipedOutputStream
{
    public static void main(String[] args) 
    {
        int m=90;
        int data;
        try {
            
            PipedOutputStream po=new PipedOutputStream();
            PipedInputStream pi=new PipedInputStream();
            po.connect(pi);
            
            for(int i=1; i<=10; i++)
            po.write(i);
           
//            while( (data=pi.read()) !=-1)
            while( (data=pi.read()) != -1 )
             {          
               System.out.println(data);
             }
        
            po.close();
            pi.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
