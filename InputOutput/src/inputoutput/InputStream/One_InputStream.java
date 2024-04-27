//mhk program to read data byte by byte(as per the chracter ascii code) from the file and make an array and store those bytes and interpret them as String.

package inputoutput.InputStream;
//import inputoutput.mypack;

import java.io.InputStream;

import java.io.FileInputStream;

import java.util.Arrays;
//import MyClass.java;


public class One_InputStream {
    
    public static void main(String[] args)
    {
//    byte[] arr=new byte[20];
    int bufferSize = 30; // You can adjust the buffer size as needed

      try 
        {
            
           FileInputStream fis = new FileInputStream("/home/mehak/Documents/Job/New-Job-Preparation/JAVA-Practice/readit2");
            byte[] arr = new byte[bufferSize];
            int bytesRead;

            // Loop to read bytes into the buffer
            while ((bytesRead =fis.read(arr)) != -1)
            {
                //correct start
    //                String content = new String(by);
    //                System.out.print(content);
                //correct ends
//                 System.out.println("Array size is "+bytesRead); 
//                 System.out.println(arr[22]);
//                 
                MyClass my=new MyClass(arr, bytesRead);
                               
//                System.out.println(by.toString()); 
                  System.out.print(Arrays.toString(arr));
                   
//                   System.out.print(bytesToString(by, bytesRead).toString());
                
            }
        }
            
        catch (Exception e)
        {
            System.out.println("Error is"+e.getMessage());
        }
        
    }
    
//     private static StringBuilder bytesToString(byte[] bytes, int length) {
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i < length; i++) {
//            sb.append((char) bytes[i]);
//        }

//        return sb;
//    }
}
