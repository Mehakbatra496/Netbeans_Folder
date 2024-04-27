
package inputoutput.Outputstream;
import java.io.BufferedInputStream;
//import java.io.BufferedOutputStream;
import java.io.*;
/**
 *
 * @author mehak
 */
public class A4_BufferedOutputStream
{
    public static void main(String[] args)
    {
      String fpath="/home/mehak/Documents/Job/New-Job-Preparation/JAVA-Practice/IOFiles/write2";
               int data;
               int k=0;
               byte[] buffer = new byte[10]; // I created a buffer to read 10 bytes a time

               try
                   {        
                        FileOutputStream fo=new FileOutputStream(fpath);
                        BufferedOutputStream bo= new BufferedOutputStream(fo,5);
                        byte[] by={22,13,42,95,52, 'a', };
                        String st="Mehak Batra mhk";
                        byte[] by2=st.getBytes();
                        
                        bo.write(1);
                       
                        bo.write(34);
                        bo.write(by);   //writing an array
                        
//                        String str=n.ew String(by2);
                        
                        bo.write(by2); //written an array (chracter)
                       
                        bo.close();
                                               
                        System.out.println("Written-----");
                   }
               
               catch (Exception e)
                   {
                        System.out.println(e.getMessage());
                   }
               
                  try 
                   {

                        FileInputStream fi=new FileInputStream(fpath);             
                        BufferedInputStream bi= new BufferedInputStream(fi);
                        System.out.println("Reading-----");

                    while((data=bi.read(buffer))!=-1)  //will read 10 bytes a time
                     { 
                         k=k+1;
                         System.out.print(data+" ");
                         System.out.println((char)data);

                     }
              
                    System.out.println("Loop is "+k);

                    
//                 while((data= bi.read(buffer))!=-1)
//                   {
//                                             k=k+1;
//   
//                       System.out.println(data);
//                   } 
//                                          System.out.println("Loop is "+k);

    }  
              catch (Exception e) 
                {
                    System.out.println(e.getMessage());
                }            
    }
}
