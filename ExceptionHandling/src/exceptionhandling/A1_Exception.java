package exceptionhandling;
import java.lang.Exception.*;
import java.util.InputMismatchException;

import java.util.Scanner;  
public class A1_Exception
    
{  
public static void main(String args[])   
{  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter a number: ");  
int number=0;
    try 
        {
    
            number = sc.nextInt();  //value will not be assigned to number if InputMismatchException will occur.
            System.out.println("You have entered: "+number);  

    
        } catch (InputMismatchException e) 
        {
//            System.out.println("Exception is "+e.printStackTrace());
            e.printStackTrace();


        }
    finally
    {
//                           System.out.println("You have entered: "+number);  

    }
    

}  
}  