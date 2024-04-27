/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CharacterStream.Reader;
import java.io.*;
/**
 * @author mehak
 */
public class A4_PipedReader
{
    public static void main(String[] args) throws  IOException
    {
//        try 
//        {
            PipedReader pr=new PipedReader();
            PipedWriter pw= new PipedWriter();
            pr.connect(pw);
            int data;
//        } 
//        catch (Exception e)
//        {
//            System.out.println(e.getMessage());
//        }
        
        Thread t1=new Thread()
         {
            public void run()
            {
                for(int i=0; i<11; i++)
                {                    
                    try
                    {
//                         pw.write(i);
                        System.out.print("Writing..  "+i+ " ");
                        pw.write(i);
                        Thread.sleep(1000);
                    }
                    catch (Exception e) 
                    {
                        
                    }
                }
            }
         };       
        Thread t2=new Thread()
        {
            int data;
            public void run()
            {
                for(int i=0; i<20; i++)
                {                      
                    try
                    {
                        while((data=pr.read())!=-1)
                        System.out.println("Reading.. "+data);
                    } 
                    catch (Exception e)
                    { 
                    }
                }
            }
        };
        
       
        t1.start();
        t2.start();
        
//         pr.close();
//         pw.close();
}
}