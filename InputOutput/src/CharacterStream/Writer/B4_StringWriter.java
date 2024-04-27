

package CharacterStream.Writer;
import java.io.*;

/**
 *
 * @author mehak
 */
public class B4_StringWriter 
{
    public static void main(String[] args)
    {
        
     String file="/home/mehak/Documents/Job/New-Job-Preparation/JAVA-Practice/IO/Write4";
     String st="My name is mhk";
     char[] ch={'f','f','l','d','m'};

        try {
                StringWriter sw=new StringWriter(20);
//                sw.write(st);
                sw.write(ch);
                
                sw.close();
                
                System.out.println(sw.getBuffer());
                System.out.println(ch.toString());
                
                
            }        
        catch (Exception e) 
        {
            
        }
    }
    
}