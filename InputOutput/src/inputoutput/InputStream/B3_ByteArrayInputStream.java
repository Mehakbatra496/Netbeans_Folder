package inputoutput.InputStream;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

/*
 * ByteArrayInputStream to read data from numerical and String array (we used getBytes() method to get that)
 * @author mehak
*/
//
public class B3_ByteArrayInputStream {

    public static void main(String[] args) throws IOException
        {

            String st="MEHAK BATRA";
            byte[] arr= st.getBytes();
            int k=0,j=0;
            byte[] arr2={2,45,6,7,2,3,45};
            
            

            String path="/home/mehak/Documents/Job/New-Job-Preparation/JAVA-Practice/readit2";

    //        FileInputStream fi=new FileInputStream(arr);
    //        byte[] arr=new byte[15];
    //        fi.read(arr);


            int data;

            ByteArrayInputStream ba=new ByteArrayInputStream(arr); 
            ByteArrayInputStream ba2=new ByteArrayInputStream(arr2); 


            while ((data=ba.read())!=-1) 
               {            
                    j=j+1;
                    System.out.print((char)data); // Byte by byte
                    System.out.print(" "); // Byte by byte
                    System.out.print(j);

               } 

             while (k<arr2.length) 
               {            
                         data=ba2.read();
                         System.out.println(data); // Byte by byte
                         k++;
               } 
    //        String obj= new String(arr);
    //        System.out.print("The whole array converted to String"+obj);

     } 
}
      