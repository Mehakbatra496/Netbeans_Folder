/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraypractice;

/**
 *
 * @author mehak
 */
public class A8_MultiplyMatrix
{
    public static void main(String[] args) {
        
        int count=0,count2=0;
        int[][] arr1=new int[2][2];
        int[][] arr2=new int[2][2]; 
        int[][] addarr=new int[2][2];

         
        for(int i=0; i<arr1.length; i++)
        {
            for(int j=0; j<arr1[i].length; j++)
            {
                count= count+1;
                arr1[i][j]=count;
                                
            }
        }
                
    for(int i=0; i<arr2.length; i++)
        {
            for(int j=0; j<arr2[i].length; j++)
            {
                count2= count2+1;
                arr2[i][j]=count2;
                
                
                                    
            }
        }

    for(int i=0; i<arr1.length; i++)
        {
            for(int j=0; j<arr1[i].length; j++)
            {
//                addarr[i][j]=arr1[i][j]+arr2[i][j];
                
                
                
                System.out.print(addarr[i][j]+" ");
                                    
            }
            System.out.println("\n");
        }

    }
}
