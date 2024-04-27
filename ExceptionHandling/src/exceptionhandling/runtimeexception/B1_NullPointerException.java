/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandling.runtimeexception;

/**
 *
 * @author mehak
 */
public class B1_NullPointerException {
    
    
    public static void main(String[] args) {
        
        
        B1_NullPointerException b1=null;
        
        try {
            
       
        int[] arr=null;
        System.out.println(arr.length);
         
         } catch (Exception e) {
        }
              
        
        try {
            
            b1.fun();

        } catch (Exception e) {
            
            e.printStackTrace();
        }

                System.out.println("Print it in every situation");
    }
    
    void fun() throws NullPointerException
    {
        System.out.println("Inside fun");
    }
    
}
