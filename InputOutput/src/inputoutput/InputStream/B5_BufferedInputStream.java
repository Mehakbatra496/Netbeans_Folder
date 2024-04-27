    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inputoutput.InputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream.*;
/**
 * 
 * Here bufferedInput stream will read the data from disk in chunks but not read byte individually from underlying input stream as shown in previous program.It read in array that read 3 bytes ( byte[] arr=new byte[3];) a time from underlying input stream., hence the loop will run 3 times.
 * 
 * @author mehak
 */
public class B5_BufferedInputStream 
{
    public static void main(String[] args) {
        
        String path="/home/mehak/Documents/Job/New-Job-Preparation/JAVA-Practice/readit2";
        int data;
        int k=0;
                            
        byte[] arr={49,50,51};

        try {
            
                FileInputStream fi= new FileInputStream(path);
                BufferedInputStream bi=new BufferedInputStream(fi);
                             
                while((data= bi.read(arr))!=-1)
                {
                    k=k+1;
//                    System.out.println((char)data);
                    String st=new String(arr,0,data);
                    System.out.println(st);
                }
                
              System.out.println("loop..."+k);

            }
        
        
        catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }

        
        
    }
}
