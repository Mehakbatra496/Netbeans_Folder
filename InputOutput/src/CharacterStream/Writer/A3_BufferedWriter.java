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
public class A3_BufferedWriter {
    public static void main(String[] args) {
        
//                String st="mhk batra";

                String file="/home/mehak/Documents/Job/New-Job-Preparation/JAVA-Practice/IO/Write4";
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
                
                
                
          try {
                    FileWriter fw=new FileWriter(file);
                    BufferedWriter bw=new BufferedWriter(fw);
                              
                    
//                    String ss=new String(ch);
//                    bw.write(ss);
                  
//                    bw.write(st);
//                    bw.newLine();

//                    bw.write(ch);
//                    bw.write(bb);
        long startTime = System.nanoTime();

bw.write(ch);

                                long endTime = System.nanoTime();

                    bw.close();
long elapsedTime = endTime - startTime;

        // Print the elapsed time
        System.out.println("Elapsed Time: " + elapsedTime + " nanoseconds");
              System.out.println("Buffered");

        } catch (Exception e) {
        }
    }
    
}
