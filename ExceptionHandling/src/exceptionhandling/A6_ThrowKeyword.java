/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandling;
import java.io.*;
/**
 *
 * @author mehak
 */
public class A6_ThrowKeyword {
   static int a=90,b=76,c;
    public static void main(String[] args) {
        try {
         
            run();
            System.out.println("hello");
        } catch (IOException e) {
            
            e.printStackTrace();
        }
        finally
        {
            System.out.println("I am in finally");
        }
        abc();
    }
    
    public static void run() throws IOException
    {
        String path="/home/dfs/jhd.txt";
            
        FileReader fr=new FileReader(path);
         
//        throw new FileNotFoundException();

    }
  
    
    
    
    //will execute in every case
    
    public static void abc() {
                    System.out.println("abc");
                    c=a+b;
                    System.out.println(c);
        
    }
    
    
}




