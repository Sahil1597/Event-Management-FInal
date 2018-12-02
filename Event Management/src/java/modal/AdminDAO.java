/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;
import java.sql.*;
/**
 *
 * @author Sahil
 */
public class AdminDAO {
    String name;
    public boolean validate(String Username, String Password)
    {
        String url = "jdbc:mysql://localhost:3306/project?useSSL=false";
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, "root", "Sahil1597@");
            String query = "SELECT * FROM admin WHERE username = ? AND password = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, Username);
            pstmt.setString(2, Password);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next())
            {
                name = rs.getString(3);
                return true;
            }
            else
            {
                return false;
            }
        }
        catch(Exception e)
        {
            System.out.println(e); 
        }
        return false;
    }
    
    public String getName()
    {
        return name;
    }
}
