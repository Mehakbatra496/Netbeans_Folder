package CharacterStream.Reader;
import java.util.Scanner;

public class Read_Character
{
    public static void main(String[] args)
    {
       
        Scanner sc= new Scanner(System.in);        
        System.out.println("Enter the data");
        int i= sc.nextInt();
        String ch=sc.next();
        double d= sc.nextDouble();     
        
//        System.out.println(i);
        System.out.println(i+" "+ch+" "+d);           
    }
}

