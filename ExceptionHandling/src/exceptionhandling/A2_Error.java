
package exceptionhandling;

public class A2_Error   
{  
    public static void main(String args[])  
    {  
    //method calling  
        recursiveDemo(10);  
    }  
    
    public static void recursiveDemo(int i)  
    {  
        while(i!=0)  
        {  
        //increments the variable i by 1  
            i=i+1;  
       
        //recursive called method  
//            System.out.println(i);
            
            
           
            recursiveDemo(i);  
             
        }  
    }  
}  
