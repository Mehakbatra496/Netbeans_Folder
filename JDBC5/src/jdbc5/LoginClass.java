/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// File to login to JDBC connection
package jdbc5;

import java.util.Scanner;
import java.sql.Connection;
import  java.sql.DriverManager;
import java.sql.PreparedStatement;
import  java.sql.ResultSet;



public class LoginClass
{
    public static void main(String[] args)
    {
        
        String myemail, mypassword;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Email id");     
        myemail= sc.next();     

        
        System.out.println("Enter Password ");
        mypassword= sc.next();
        
        try
            {
               Connection con= DriverManager.getConnection("jdbc:mysql://localhost/jdbc5","mehak","111");
               
               
               PreparedStatement ps=con.prepareStatement("select * from register where email =? and password=?");
               ps.setString(1, myemail);      
               ps.setString(2, mypassword);

               ResultSet rs=  ps.executeQuery();
               
                   
                               
                               
               
              if(rs.next())
            {
                System.out.println("Login Successfully");
                System.out.println("Welcome : "+rs.getString("email"));   

            }
              else
                    System.out.println("Invalid username or password");
             
//               System.out.println(rs.getString("email"));
               
            } 
        catch (Exception e) 
        {
            System.out.println("Issue is "+e.getMessage());
        }

    }
    
    
}
