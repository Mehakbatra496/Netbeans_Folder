/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringpractice;

/**
 *
 * @author mehak
 */
public class A1_StringOccurance
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int count=1;
        // TODO code application logic here
        String s1=new String("tttttaaaaa");
//       s1.length();
        char[] arr= s1.toCharArray();

        int len=arr.length;
         
//        for(int i=0; i<len; i++)
//        {
//            arr[i]=s1.charAt(i);
//        }
        
        for(int i=0; i<len; i++)
        {
            System.out.println("i is "+i);
            for(int j=i+1; j<len; j++)
            {
                System.out.println("I am inside j.................................................");
                System.out.println("i is "+i+" , j is "+j+" , len is "+len);
                System.out.println("arr[i] is "+arr[i]+" , arr[j] is "+arr[j]);

                if(arr[i]==arr[j])
                {
                    System.out.println("arr[i] is "+arr[i]+" , arr[j] is "+arr[j]);

                    for(int k=j+1; k<len; k++)
                    {
                        arr[k-1]=arr[k];
//                        j=j+1;
                    }
                    len=len-1;
                    
                    j=j-1;
                    
                    System.out.println("********************* New Array is *****************************");
                  for(int m=0; m<len; m++)
                    {
                        System.out.println(arr[i]);
                    }
                }
            }
            System.out.println("");
        }
      
//        System.out.println("");
//        for(int i=0; i<len; i++)
//        {
//            System.out.println(arr[i]);
//        }
    }
    
}
