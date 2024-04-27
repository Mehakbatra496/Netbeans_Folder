/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author mehak
 */
public class Delete {
    
    public static void main(String[] args) 
    {
        String sql="delete from players where name=? ";
        Connection mycon=MyConnection.createConnection();
        try {
            
  
            PreparedStatement ps= mycon.prepareStatement(sql);
            ps.setString(1,"Mehak");
             ps.executeUpdate();
              System.out.println("sucesssfully deleted");
            
        }
        catch (Exception e) 
        {                                                                    
              System.out.println(e);
        }
     }
    }
    

