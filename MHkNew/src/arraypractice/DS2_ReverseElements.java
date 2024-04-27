/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraypractice;

/**
 *
 * @author mehak
 */
public class DS2_ReverseElements {
    public static void main(String[] args) 
    {    
        int[] arr1= new int[]{12,45,66,21,34};
        int length= arr1.length;
        int temp;
        
        int len=length-1;
        for(int i=0; i<length/2;i++)
        {
            temp=arr1[i];
            arr1[i]=arr1[len];
            arr1[len]=temp;
            len=len-1;
        }
        
        for(int j=0; j<length;j++)
        {
            System.out.println(arr1[j]);
        }
    }           
}
