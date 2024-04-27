package arraypractice;

public class DS6_LargestElement {
    public static void main(String[] args) 
    {
        int[] arr1= new int[]{2,67,99,32,33,-77,10,42,5,55,3,77};
        int small=arr1[0];
        
        for(int i=0; i<arr1.length;i++)
         {
            for(int j=i+1; j<arr1.length;j++)
            {
                    System.out.println("arr[i] is "+arr1[i]+"  "+arr1[j]);
                    if(small>arr1[j])
                    {
                        small=arr1[j];
                    }
//                    else
//                    {
//                        large=arr1[i];
//                    }
                }            
         }
            System.out.println(small);
    }
}
