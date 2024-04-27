/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraypractice;

/**
 *
 * @author mehak
 */
public class DS1_CheckElementsDS
    {
      public static void main(String[] args) {
        int count=0;
        float average=0,total=0;
        int arr[]= new int[]{1,2,3,4,5,6};
         
        for(int i:arr)
        {
             count=count +1;         //to check the numbers of element in array
//            System.out.println(i);
             total= arr[i-1]+total;
        }
        
        average =total/count;
        System.out.println(average);
//        System.out.println(count);      
           
    }
}