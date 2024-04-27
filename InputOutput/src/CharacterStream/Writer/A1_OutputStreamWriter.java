/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CharacterStream.Writer;
import java.io.*;
/**
 *
 * @author mehak
 */
public class A1_OutputStreamWriter {
    public static void main(String[] args)
    {
        String st=" This is MHk";
        String st2=" 2024";
        char ch='m';
        char[] barr={'A','B','V'};
        
        
        String file="/home/mehak/Documents/Job/New-Job-Preparation/JAVA-Practice/IO/Write2";
        
        try {
                FileOutputStream fo= new FileOutputStream(file);
                OutputStreamWriter ow=new OutputStreamWriter(fo);
                
                
                ow.write(st);
                ow.append(st2);
                ow.append(ch);
                
//                String ss=new String(barr);
                ow.write(barr);
                
                
                ow.close();
                

        } catch (Exception e) {
            
        }
        
    }
    
}
