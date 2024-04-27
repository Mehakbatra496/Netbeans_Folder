/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraypractice;

/**
 *
 * @author mehak
 */
public class DS9_RightRotate {
    public static void main(String[] args) {
        
                int[] arr1= new int[]{22,33,55,3,77,9};
                
                int beg,end,rotate=3,temp,i=0;
                end=arr1.length-1;
                
                for( i=0; i<rotate; i++) //rotate=2
//                {

//                while(i<rotate)
                {
                    temp=arr1[end];
                    System.out.println("temp is "+temp);
//                    System.out.println("......................i is "+i);

                     
                    for(int j=end-1; j>=0; j--)
                    {
                        System.out.println("j is "+j);
                        arr1[j+1]=arr1[j];
                    }
                    
                    arr1[0]=temp;
//                  
                    System.out.println();
                    for(int k=0; k<arr1.length; k++)
                    {
                        System.out.println(arr1[k]);
                    }
                                        System.out.println();

                }
                
              

                

    }
}
