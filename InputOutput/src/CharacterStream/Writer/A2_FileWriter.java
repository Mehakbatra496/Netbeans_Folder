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
public class A2_FileWriter
{
    public static void main(String[] args)
    {
        String file="/home/mehak/Documents/Job/New-Job-Preparation/JAVA-Practice/IO/Write2";
//        String st="hello mhk";

        char[] ch = {'f', 'b', 'm', 'c', 'h', 'b', 'y', 't', 'k', 'n',
             'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
             'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
             'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4',
             '5', '6', '7', '8', '9', '0', '!', '@', '#', '$',
             '%', '^', '&', '*', '(', ')', '_', '+', '-', '=',
             '{', '}', '[', ']', '|', '\\', ':', ';', '<', '>',
             ',', '.', '/', '?', '`', '~', ' ', ' ', ' ', ' ', // 100 additional spaces
             ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
             ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
             ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};

// The array now contains the original 10 characters followed by 100 additional characters.
//        byte[] brr={1,2,3}; //wrong
            
        try
        {
            
            FileWriter fw=new FileWriter(file);
//            fw.write(st);
        long startTime = System.nanoTime();

            fw.write(ch);
           long endTime = System.nanoTime();

//            String ss=new String(brr); //wrong
            
            fw.close();
long elapsedTime = endTime - startTime;
        System.out.println("Elapsed Time: " + elapsedTime + " nanoseconds");

            
            
        } catch (Exception e)
        
        {
        }
    }
}
