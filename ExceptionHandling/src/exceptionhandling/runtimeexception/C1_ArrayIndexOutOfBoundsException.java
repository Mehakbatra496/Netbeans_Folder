/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandling.runtimeexception;

/**
 *
 * @author mehak
 */

public class C1_ArrayIndexOutOfBoundsException 
{
     
    public static void main(String[] args) {
        
        int[] arr = {56,78,34,21,5};
        int index=0;
//        for(int x: arr)
//          {
//            System.out.println(x);
////            index++;
//          }

        try {      
                for(int i=0; i<=10; i++)
                {
                    System.out.println(arr[i]);
                }
            } catch (Exception e) 
           {
               e.printStackTrace();
           }    
        System.out.println("mhk");
    }
    
}
