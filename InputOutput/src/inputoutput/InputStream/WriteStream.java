package inputoutput.InputStream;
import java.io.FileOutputStream;

public class WriteStream {
    public static void main(String[] args) {
        
        try
        {
            String st="This is mhk";
            
            byte[] b=st.getBytes();
//         Char ch=;
//         int k=30;
         FileOutputStream fo=new FileOutputStream("/home/mehak/Documents/Job/New-Job-Preparation/JAVA-Practice/readit");

         
         fo.write(b);
         fo.close();
        } 
        catch (Exception e) 
        {
            System.out.println("error is "+e.getMessage());
        }
        
    }
}