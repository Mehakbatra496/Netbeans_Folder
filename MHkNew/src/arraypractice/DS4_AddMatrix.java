package arraypractice;

public class DS4_AddMatrix 
{
    public static void main(String[] args)
    {
        int[][] arr1= new int[][]{{2,4,5},{9,5,3}};
        int[][] arr2= new int[][]{{2,4,5},{9,5,3}};
        int[][] arr3= new int[3][3];

        for(int i=0; i<arr1.length; i++)
        {
              for(int j=0; j<arr1[0].length; j++)
                { 
                  arr3[i][j]= arr1[i][j]+arr2[i][j];
                }
        }
         for(int i=0; i<2; i++)
        {
              for(int j=0; j<3; j++)
                { 
                  System.out.print(arr3[i][j]+" ");
                }
              System.out.println("");
        }
    }
}
