/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraypractice;

/**
 *
 * @author mehak
 */
public class DS5_PrintElement {
    public static void main(String[] args) 
    {
        int[] arr1= new int[]{0,1,2,3,4,5,6,7,8,9};
        int[] arr2=new int[arr1.length];
//        for(int i=1; i<arr1.length; i=i+2)
//        {
//            System.out.println(arr1[i]);
//        }
          for(int i=0; i<arr1.length; i=i+1)
        {
                arr2[i]=arr1[i];
        }
            for(int i=0; i<arr2.length; i=i+1)
        {
                System.out.println(arr2[i]);
        }
    }
}
