
package inputoutput.Outputstream;
import java.io.*;

public class A6_PipedOutputStream 
{
    public int i=0;    
 

    public static void main(String args[])
    {
           PipedInputStream pi=new PipedInputStream();     
           PipedOutputStream po=new PipedOutputStream();

        try
          {               
                po.connect(pi);
                WriteThread ww=new WriteThread();
                ReadThread rr=new ReadThread();
                ww.start();             
          } 
        catch (Exception e) 
          {
              System.out.println(e.getMessage());
          }
    }    
}
        
class WriteThread extends Thread 
{
    
    public void run()
    {     

         
       try {
            
            for(int j=0; j<10; j++)
               {
//                   po.write(j);
               }
                   
            }
       catch (Exception e) {
            }
       }

}

class ReadThread extends Thread
{
      int i=9;
      public void run()
        {
         System.out.println(i);
        }
}

