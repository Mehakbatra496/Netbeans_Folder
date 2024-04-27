package inputoutput.InputStream;

import java.io.*;

public class B9_PipedInputStream {
    public static void main(String[] args) throws Exception
    {
        String str="this is demo";
        
        PipedInputStream pis=new PipedInputStream();
        PipedOutputStream pos=new PipedOutputStream();
        
        pis.connect(pos);
        
        pos.write(str.getBytes());
        
        int i;
        while( (i=pis.read()) != -1 )
        {
            System.out.print((char)i);
        }
    }
}






