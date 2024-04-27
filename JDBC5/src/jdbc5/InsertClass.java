/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc5;
import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author mehak
 */
public class InsertClass
{
    public static void main(String[] args)
    {        
        String name, city;
        int age;
        long mobile;
        int total;
        
        
        Scanner sc= new Scanner(System.in);
        System.out.println("How many details you want to insert ");
        total=  sc.nextInt();
        
      
        
//                System.out.println("You entered ");
//                System.out.println(name+" "+city+" "+age+" "+mobile);

   try {
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/jdbc5","mehak","111");
        PreparedStatement ps=con.prepareStatement("insert into employee values(default,?,?,?,?)");

        for(int i=0; i<total; i++)
          {   

                 System.out.println("Enter the details of the employee in order Name, City, Age, Mobile No.");

            name=sc.next();
            city=sc.next();
            age = sc.nextInt();
            mobile=sc.nextLong();

        ps.setString(1, name);
        ps.setInt(2, age);
        ps.setString(3,city);
        ps.setLong(4, mobile);

        ps.executeUpdate();
     }
        System.out.println("Employee Details Inserted Successfully");

                    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
//        PreparedStatement ps= 
        
        
        
    }
 
}
