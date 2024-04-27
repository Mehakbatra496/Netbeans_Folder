/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package file_operations;
import java.io.File;
/**
 *
 * @author mehak
 */
public class A1_CreateFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      String file = "/home/mehak/Documents/Job/New-Job-Preparation/JAVA-Practice/File-Operation/A1";
      File fi= new File(file);
        File di=new File("/home/mehak/Documents/Job/New-Job-Preparation/JAVA-Practice/File-Operation/MyDirectory");
        
        try {
      
            if( fi.createNewFile())
            {
                System.out.println("File Created named "+fi.getName());
            }

             // TODO code application logic here

            else
            {
                System.out.println("File Already exist ");

            }
            
            boolean created=di.mkdir();
            if(created)
            {
                System.out.println("Created Successfully ");
            }
            else{
                System.out.println("Can  not create");
            }
            
             
        } catch (Exception e)
        {
            
            System.out.println("An unexpected error is occurred.");  

        }
    
}

}