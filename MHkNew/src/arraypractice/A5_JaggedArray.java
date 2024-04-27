/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraypractice;

/**
 *
 * @author mehak
 */
public class A5_JaggedArray {
    public static void main(String[] args) {
        
        String[] ss={"aaa", "kkk", "ooo"};
        int count=0;
        int[][] arr=new int[4][];  //column is not fixed
        
         arr[0]= new int[3];    //Assigning column per row
         arr[1]= new int[2];
         arr[2]= new int[4];
         arr[3]= new int[6];

                  
         for(int i=0; i<arr.length; i++)
         {
             for(int j=0; j<arr[i].length;j++)
             {
                  count=count+1;
                 arr[i][j]=count;
             }
         }
         for(int i=0; i<arr.length; i++)
         {
             for(int j=0; j<arr[i].length;j++)
             {
                 System.out.print(arr[i][j]+" ");    
             }
             System.out.println("\n");
         }
        
       Class cc=  ss.getClass();
        System.out.println(cc.getName());
    }
}
