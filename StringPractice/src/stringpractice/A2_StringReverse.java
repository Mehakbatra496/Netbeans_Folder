/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stringpractice;

/**
 *
 * @author mehak
 */
public class A2_StringReverse  // reverse a string using string and also with character array
{
    public static void main(String[] args) 
    {
        String st1= new String("MehakBatra"); //10
        String st2= new String("");
        
        char[] ch1= new char[st1.length()];
        int length= st1.length();
        int len=length-1;
        
        // reverse a string using character array
//        for(int i=0 ; i<length; i++)
//        {
//                ch1[len]= st1.charAt(i);
//                len=len-1;
//                
//        }
//        
//        for(int j=0; j<length; j++)
//        {
//            System.out.print(ch1[j]);
//        }
          // reverse a string using character array
      
             // reverse a string using string
          
     
             for(int k=len; k>=0; k--)     
             {
                 st2= st2+st1.charAt(k);
             }
             System.out.println(st2);
             
    }
}
