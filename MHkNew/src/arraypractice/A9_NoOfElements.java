/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraypractice;/**
 *
 * @author mehak
 */
import java.util.ArrayList;
import java.util.Arrays;
public class A9_NoOfElements{
    public static void main(String[] args) {
        
        int[] arr1= new int[]{23,12,45,67,6,90};
        int[] arr3= new int[]{23,12,45,67,55,6,543};
        
        int n;
        n=arr1.length;
        
//    System.out.println(n);
//    System.out.println(arr1.clone());

//        int[] arr2= arr1.clone();
        
//        String s1=arr2.toString();
//        String s1=Arrays.toString(arr2);
 
//        System.out.println(s1);
//        System.out.println(Arrays.equals(arr1, arr2));
//        System.out.println(arr1.equals(arr1 ));
       Arrays.sort(arr1);
       
//       for(int i=0;i<arr1.length; i++)
//        System.out.println(arr1[i]);
//System.err.println(Arrays.r);
System.out.println();     
        
//        System.out.println(Arrays.mismatch(arr1, arr3));

        int[] arr5= Arrays.copyOfRange(arr1, 0,3);
       
        for(int i=0;i<arr5.length; i++)
           System.out.println(arr5[i]);
          
//         System.out.println(Arrays.asList(arr1));
       
    }
}
