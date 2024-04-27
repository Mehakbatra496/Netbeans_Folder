/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author mehak
 */
    public class SelectClass
    {
        public static void main(String[] args) {
            
            try {
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost/jdbc5","mehak","111");
             String sql="select * from employee";
              
             Statement ss= con.createStatement();          
             ResultSet rs=ss.executeQuery(sql);
                System.out.println(rs);
             while(rs.next())
             {
                 System.out.print(rs.getString("emp_id"));      
                                  System.out.print(" ");

                 System.out.print(rs.getString("emp_name"));
                                  System.out.print(" ");
                 System.out.print(rs.getString("emp_age"));        
                                                            System.out.print(" ");
                 System.out.print(rs.getString("emp_city"));   
                                                          System.out.print(" ");
                 System.out.print(rs.getString("emp_mobile"));         
         
                 System.out.println(" ");
             }

            } 
            
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
             

        }
    }
