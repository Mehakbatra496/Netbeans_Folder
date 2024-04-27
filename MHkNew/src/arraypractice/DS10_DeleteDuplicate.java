/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraypractice;

/**
 *
 * @author mehak
 */
public class DS10_DeleteDuplicate {
    public static void main(String[] args) {
        
        int arr[]= new int[]{11,12,13,11,12,13,11,12,13,11};
        int length= arr.length;
        
        for(int i=0; i<length; i++)
        {
            System.out.println("i is "+i);
            for(int j=0; j<length; j++ )
            {
                System.out.println("j is "+j);

                if(arr[i]==arr[j]&&(i!=j))
                {

                    System.out.println(arr[i] +" at "+i+ " is equal to "+arr[j]+" at "+j);
                    
                    arr[j]=0;
                    
                    for(int k=j+1; k<length; k++)
                    {
                        arr[j]=arr[k];         
                        j=j+1;
                    }
                   
                    length=length-1;
                    System.out.println("length %is "+length);
                    break;
                }
            }
        }
        System.out.println("Answer is.........................................................");
         for(int m=0;m<length; m++)
        {
            System.out.println(arr[m]);
        }
        
        
    }
}
