/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inputoutput.Outputstream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream.*;
import java.io.OutputStream.*;
/**
 *
 * @author mehak
 */
public class A3_DataOutputStream
{
    public static void main(String[] args) 
    {
               String fpath="/home/mehak/Documents/Job/New-Job-Preparation/JAVA-Practice/IOFiles/write1";
                int data; 
                byte[] by={48,49,50,51,52,55,56};
                byte[] by2=new byte[20];
               
               try
               {
                    FileOutputStream fo=new FileOutputStream(fpath);
                    DataOutputStream dos=new DataOutputStream(fo);

                    dos.writeInt(15);
                    dos.writeChar('S');
                    dos.writeBoolean(true);
                    dos.writeDouble(12.5);
                    dos.writeUTF("Mehak");
                    dos.write(by);
                    
                    System.out.println("Data written successfully");
             
               } 
               catch (Exception e)
               {
                    System.out.println(e.getMessage());
               }
               
               try
               {
                    FileInputStream fi=new FileInputStream(fpath);               
                    DataInputStream di=new DataInputStream(fi);
                  
                    int i=  di.readInt();
                    char ch= di.readChar();
                    boolean b= di.readBoolean();
                    double d=  di.readDouble();
                    String name=di.readUTF();
                    by2=di.readAllBytes();
                    
                    System.out.println(di.readAllBytes());
                    
                     System.out.println(i+" "+d+" "+ch+" "+b+" "+name);

                    for(int l=0; l<by2.length;l++)
                    {
                        System.out.println(by2[l]);
                    }
                    
                    String st=new String(by2);
                    
                    
                    
//                                   

//                     while((data=di.readNBytes(3))!=-1)

//                    System.out.println(st);
                } 
               catch (Exception e) 
               {
                    System.out.println(e.getMessage());
               }              

    }
}
