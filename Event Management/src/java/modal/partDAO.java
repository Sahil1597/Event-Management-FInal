/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author Sahil
 */
public class partDAO {
    
    String name;
    
    public boolean save(part u)
    {
        String url = "jdbc:mysql://localhost:3306/project?useSSL=false";
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,"root","Sahil1597@");
            String query = "INSERT INTO part () VALUES (?,?,?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1,u.getFname());
            pstmt.setString(2,u.getLname());
            pstmt.setString(3,u.getPhone());
            pstmt.setString(4,u.getId());
            pstmt.setString(5,u.getAddress());
            
            if(pstmt.executeUpdate() > 0)
            {
                
                return true;
            }
            else
            {
                return false;
            }

         }
        catch(Exception e)
        {
            System.out.print(e);
        }
     return false;   
    }
    
    public String getFname()
    {
        return name;
    }
    
}
