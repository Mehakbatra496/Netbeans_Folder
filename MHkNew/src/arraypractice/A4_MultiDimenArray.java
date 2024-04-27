/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraypractice;

/**
 *
 * @author mehak
 */
public class A4_MultiDimenArray {
    
    public static void main(String[] args) {
        
        int arr[]={45,55,62,33};
//        int[][] arr= new int[2][3];
//        int[][] arr2= {{34,99,22},{56,67,33}};
//        
//        for(int i=0; i<2; i++)
//        {
//            for(int j=0; j<3; j++)
//            {
//                System.out.println(arr2[i][j]);
//            }
//        }
//        
//        int[][] arr= new int[2][3];
//        arr[0][0]=23;
//        arr[0][1]=44;
        
//        passArray(arr);
int result[]= get();
//        anon(new int[]{15,6,33,21});
for(int j=0; j<result.length; j++)
            {
                System.out.println(result[j]);
            }
    }
    
    public static int[] get()
    {
                int arr[]={1,2,3,4};
                return arr;
    }
    
//    public static int [] passArray(int arr[])
//    {
//         for(int i=0; i<arr.length; i++)
//        {
////         for(int j=0; j<3; j++)
////            {
////                System.out.println(arr[i]);
////            }
//    }
//         
//         
//    }
    
    public static void anon(int arr2[])
    {
        for(int i=0; i<arr2.length;i++)
        {
            System.out.println(arr2[i]);
        }
    }
}


