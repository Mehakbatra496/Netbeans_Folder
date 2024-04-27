package inputoutput.InputStream;
import  java.io.ByteArrayOutputStream;

/**
 * @author mehak
*/

public class Five_ByteArrayOutputStream
{
    public static void main(String[] args) throws Exception
    {
        String str="abcdef";
        ByteArrayOutputStream by=new ByteArrayOutputStream();
        
        byte[] arr=str.getBytes();
        by.write(arr);
        
        System.out.println(by.toString());      
        System.out.println(by.toByteArray());   
        System.out.println(arr[1]);    
        System.out.println(arr[2]);
        
                
    }
} 