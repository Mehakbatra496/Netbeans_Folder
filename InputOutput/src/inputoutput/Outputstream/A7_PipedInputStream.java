
package inputoutput.Outputstream;
import java.io.*;

 class A7_PipedInputStream {

    public static void main(String[] args) 
    {
     PipedOutputStream po=new PipedOutputStream();
     PipedInputStream pi=new PipedInputStream();     
                                                                                        
        try 
        {
            po.connect(pi);
        } 
        catch (Exception e) 
        {
        
        }
            
        Thread t1=new Thread()
        {
            public void run()
            {
               for(int i=0; i<12; i++)
                    {
                        try
                        {
                
                            System.out.println(" Writing "+i);
                            po.write(i);
                            
                            Thread.sleep(1);
                        }
                        catch (Exception e) 
                        {
                             System.out.println(e.getMessage());
                        }
                    }
            }
        };
        
        Thread t2= new Thread()
        {
            
            public void run()
            {
                for(int i=0; i<10; i++)
                    {
                      try 
                        {
                              System.out.println("Reading "+ pi.read());
                        } 
                      catch (Exception e)
                        {
                           System.out.println(e.getMessage());
                        }
                    }
            }
        };   
        
        t1.start();
        t2.start();
    }
}