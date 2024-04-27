/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inputoutput.InputStream;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *
 * @author mehak
 */
public class A1_FileInputStream
{
    public static void main(String[] args) throws FileNotFoundException
    {
        String path="/home/mehak/Documents/Job/New-Job-Preparation/JAVA-Practice/readit2";
        FileInputStream fi=new FileInputStream(path);
        byte[] arr=new byte[100];

        int data;
//        while(  (data=fi.read())!=-1) //one way to read mhk
//        {
//             System.out.print((char)data);

//        }

//        while(  (data=fi.read())!=-1) //one way to read mhk
//        {
//            fi.read(arr);

            String st=new String(arr);  //another way
//        }      
                    System.out.print("Read from file "+st);
    }
}
