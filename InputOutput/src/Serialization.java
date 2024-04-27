
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;


import java.io.*;
class Ser implements Serializable
{
    
}

class Student extends Ser
{
    String name;
    int age;
    public Student(String name, int age)
    {
        this.name=name;
        this.age=age;
    } 
}
public class Serialization
{
    public static void main(String[] args) {
        
      String file="/home/mehak/Documents/Job/New-Job-Preparation/JAVA-Practice/IOFiles/Write8";
      
        try {
            FileOutputStream fos=new FileOutputStream(file);
            ObjectOutputStream os=new ObjectOutputStream(fos);
            
            Student ss=new Student("Mehak", 101);  //Serialization
            
            os.writeObject(ss);
            
            FileInputStream fis=new FileInputStream(file);
            ObjectInputStream ois=new ObjectInputStream(fis);
            Student s=(Student)ois.readObject();     //Deserialization
            System.out.println("Name "+s.name);
            System.out.println("Age "+s.age);
            
            
            } 
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }  
    }
}
