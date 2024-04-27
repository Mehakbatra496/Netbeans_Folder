/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc5;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

import java.util.Scanner;

/**
 *
 * @author mehak
 */
public class InsertPractice
{
     public static void main(String[] args)
    {        
      
        int id;
        String name1;
     
        System.out.println("Enter name ");
        Scanner sc= new Scanner(System.in);
        name1=sc.next();
        
  
        try {
            
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost/jdbc5","mehak","111");
                    
//                    String sql="select * from employee where emp_name=name1" ;
                    String sql = "select * from employee where emp_name = '" + name1 + "'";
                    Statement ss=con.createStatement();

//                    ss.executeUpdate(sql);
                    
                    ResultSet resultSet = ss.executeQuery(sql);
                 
                  while(resultSet.next())
                         {
//                            int id=resultSet.getInt("emp_id");   
                            String name=resultSet.getString("emp_name"); 

                            int age=resultSet.getInt("emp_age");

                            String city=resultSet.getString("emp_city");
                            long mobile=resultSet.getLong("emp_mobile");

                            //Printing Results
                            
                            System.out.println("Name = "+name);
                            System.out.println("Age = "+age); 
                            System.out.println("City = "+city);
                            System.out.println("Mobile = "+mobile);

                          }     
//                }
//                else
//                {
//                    System.out.println("Record not found");
                    
//                }
                                       
        } catch (SQLException e) 
        {
            
            System.out.println(e.getMessage());
        }
       
    }
}
