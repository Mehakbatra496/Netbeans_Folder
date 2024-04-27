/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopspillers;
import java.util.Scanner;   
import javax.swing.DefaultBoundedRangeModel;
// @author mehak

class Calculator
{
    public int calculate(int... a)
    {
        System.out.println("Inside one");
        for(int num:a)
        {
            System.out.println(num);
        }
        return 1;
//        return (a+b);
    }
    
    public double calculate(double a, double b)
    {
                System.out.println("Inside Two");
                        return (a+b);


    }
    public long calculate(long a, long b)
    {
                System.out.println("Inside Three");
                        return (a+b);


    }
    
    public double calculate(int a, double b)
    {
                System.out.println("Inside four ");
                        return (a+b);


    }
    
    public int calculate(char a, char b)
    {
             System.out.println("Inside five");
                     return (a+b);

   
    }
    public String calculate(String a, String b)
    {
             System.out.println("Inside six ");
                     return (a+b);

    }
    
}
    
public class A3_Polymorphism {
    public static void main(String[] args)
    {
        Calculator c1= new Calculator();
        Scanner sc=new Scanner(System.in);
        int action= 1;
        
        switch (action) {
            case 1:
                System.out.println(c1.calculate(54,45,4,2,4,56,65,7));
            break;

            case 2:
                
            break;
            
            case 3:
                
            break;
                
            case 4:

            break;
                 
        }
        
//        c1.calculate(23,34);
//        c1.calculate(34.5,67.9);
//        c1.calculate("mb","mb");
//        c1.calculate(54654656547544.344, 5645656546765.65);
//        c1.calculate(543563635, 545455645);
                
              
    }
}
