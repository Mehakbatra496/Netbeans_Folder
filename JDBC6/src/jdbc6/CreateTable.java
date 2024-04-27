/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc6;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;

import java.sql.Connection;

/**
 *
 * @author mehak
 */
public class CreateTable {
    public static void main(String[] args) 
    {
        Connection con= MyConnection.createConnection();
        String sql="create table students (rollno int primary key, name varchar(50) not null, class varchar(40))";
        try
        {
              Statement ss= con.createStatement();
               ss.execute(sql);
//            System.out.println(rs);
        } 
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}


