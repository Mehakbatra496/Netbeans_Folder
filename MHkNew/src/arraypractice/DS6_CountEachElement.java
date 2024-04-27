/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraypractice;

/**
 *
 * @author mehak
 */
public class DS6_CountEachElement {
    public static void main(String[] args) {
        
        int[] arr1= new int[]{1,5,2,2,2,2,3,3,3,1,2};
        int[] arr2= new int[arr1.length];
        boolean[] b1=new boolean[arr1.length];
        
        for(int i=0; i<arr1.length; i++)
        {
            for(int j=i+1; j<arr1.length;j++)
            {
                if(arr1[i]==arr1[j])
                {
                    arr2[i]=arr2[i]+1;
                    
                    b1[j]=true;
        
        }
            }
        }
        
        for(int i=0; i<arr1.length; i++)
        {
            System.out.println(arr1[i]+" is repeated "+(arr2[i]+1));
        }
        
    }
}
