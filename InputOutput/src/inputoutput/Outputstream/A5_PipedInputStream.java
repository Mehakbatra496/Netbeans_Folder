
package inputoutput.Outputstream;

import java.io.*;  
class A5_PipedInputStream
{  

    public static void main(String args[])throws Exception
    {  
        final PipedOutputStream pout=new PipedOutputStream();  
        final PipedInputStream pin=new PipedInputStream();  
          
        pout.connect(pin);//connecting the streams  
        //creating one thread t1 which writes the data  
        Thread t1=new Thread()
        {  
            public void run()
            {  
                for(int i=65;i<=70;i++)
                {  
                    try
                    {  
                       pout.write(i);  
                    //Thread.sleep(100);  
                    }
                    catch(Exception e)
                    {
                        System.out.println(e.getMessage());
                    }  
                }  
           }  
        };  
        //creating another thread t2 which reads the data  
        Thread t2=new Thread()
        {  
          public void run(){  
       
                try{   
                    for(int i=65;i<=70;i++)  
                    System.out.println(pin.read());  
                }
                catch(Exception e){}  
                }  
        };  
        
        //starting both threads  
        
        System.out.println("Threads are going to start...");
        t1.start();  
        t2.start();  
   }
}  