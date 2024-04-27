/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inputoutput.InputStream;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author mehak
*/

class Employee implements Serializable
{
    String name;
    int id;

    public Employee(String name, int id) 
    {
        this.name=name;
        this.id=id;
    }
        
}

public class Seven_ObjectOutputStream {

    public static void main(String[] args)
    { 
        
        Seven_ObjectOutputStream dog=new Seven_ObjectOutputStream();
        Employee emp=new Employee("MHk", 211);
//        System.out.println(emp.name);   
//        System.out.println(emp.id);
        try {
            FileOutputStream fo=new FileOutputStream("/home/mehak/Documents/Job/New-Job-Preparation/JAVA-Practice/readit");
            
            ObjectOutputStream oo=new ObjectOutputStream(fo);
            
            oo.writeObject(emp);
            
             FileInputStream fi=new FileInputStream("/home/mehak/Documents/Job/New-Job-Preparation/JAVA-Practice/readit");
            
            ObjectInputStream oi=new ObjectInputStream(fi);
            
            Employee newEmp= (Employee)oi.readObject(); //type cast
            
            System.out.println(newEmp.id);   
            System.out.println(newEmp.name); 

            
            
        }
        catch (Exception e) {
        }
    }


    
}