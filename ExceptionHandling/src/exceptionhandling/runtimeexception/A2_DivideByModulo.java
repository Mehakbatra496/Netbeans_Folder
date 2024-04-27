/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandling.runtimeexception;
import java.lang.Math;

/**
 *
 * @author mehak
 */
public class A2_DivideByModulo {
    
    public static void main(String[] args) {
        
        try {
            
//        int a=25, b=0,c; c=a%b;
//      
//        System.out.println(c);
        
               Math.sqrt(16);
            } 
        
        
        catch(ArithmeticException e)
            {
                e.printStackTrace();
            }

        int max=Integer.MAX_VALUE;
        int result= Integer.MAX_VALUE*2;
        double result2 = Math.pow(10, 1000); // ArithmeticException (overflow)

               
        System.out.println(result);
                System.out.println(result2);

        int value = 10;
int result3 = value << 32;

        System.out.println(result3);
        
        System.out.println("Print it in every situation");
    }
}
