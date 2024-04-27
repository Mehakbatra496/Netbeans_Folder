/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

import java.util.Scanner;

/**
 *
 * @author mehak
 */
public class DeleteClass 
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

//                  String sql="select * from employee where emp_name=name1" ;
                    String sql = "delete from employee where emp_name =?";
                    PreparedStatement ps=con.prepareStatement(sql);
                    ps.setString(1,name1);
//                  ss.executeUpdate(sql);
                    ps.executeUpdate();

        } catch (SQLException e) 
        {
                    System.out.println(e.getMessage());
        }
    }
}
