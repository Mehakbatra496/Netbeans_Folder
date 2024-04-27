

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inputoutput.Outputstream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**program to write into a program
 *
 * @author mehak
 * 
 */

public class A2_BufferedOutputStream 
{
   public static void main(String[] args)
   {
       String fpath="/home/mehak/Documents/Job/New-Job-Preparation/JAVA-Practice/readit9";
        char ch='S';
        int i=17;
        String st="new mhk battra";
        byte[] arr= st.getBytes();
        
        try {
             FileOutputStream fo=new FileOutputStream(fpath,true);
             BufferedOutputStream bo=new BufferedOutputStream(fo);
             
//             bo.write(Character.toString(ch).getBytes());
//             bo.write(ch.getBytes()); 
//                bo.write(Integer.toString(i).getBytes());
//            bo.write("\n".getBytes());

             bo.write(ch);
             bo.close();
//             bo.write(i);
//             bo.write(arr);
                         

//             bo.write(arr);
             System.out.println("Data Successfully written ");
        
        } catch (Exception e) {
            System.out.println("error is "+e.getMessage());
        }
        
    }   
}

