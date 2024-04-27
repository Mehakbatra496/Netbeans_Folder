/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandling.runtimeexception;

/**
 *
 * @author mehak
 */
public class D1_IllegalArgumentException
{
    public static void main(String[] args)
    {
        
         Employee e1=new Employee();
//         try {
                   
         e1.fun(-5);
//         e1.fun(25);
         e1.fun(55);
         
//         } catch (Exception e) {
//        }

    }
    
}

 class Employee
{
    public void fun(int age)
    {
        if(age<0 || age>100)
        {
            throw new IllegalArgumentException(Integer.toString(age));
        }
        else
        {
            System.out.print("Age is "+age);
        }
            
    }
}
