package exceptionhandling;

import java.lang.ArithmeticException;
import java.lang.ArithmeticException;
import java.lang.ArithmeticException;




public class A3_ArithematicException
{
    public static void main(String[] args) {
        
        
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        
        try {
                    System.out.println(4/0);

        } catch (Exception e) {
            System.out.println("Exception "+e.getMessage());
        }
        System.out.println("5");
        System.out.println("6");
        
        
        
    }
}