/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Sahil
 */
public class eventDAO {
    String name;
    
    public boolean save(event u)
    {
        String url = "jdbc:mysql://localhost:3306/project?useSSL=false";
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,"root","Sahil1597@");
//            String query = "INSERT INTO event values eventname = ? AND name = ?";
//            PreparedStatement pstmt = con.prepareStatement(query);
//            ResultSet rs = pstmt.executeQuery();
//            if(rs.next())
//            {
//                name = rs.getString(3);
//                return true; 
//            }
//               else
//            {
//                return false;
//            }
                   
            String query = "INSERT INTO event () VALUES (?,?,?,?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1,u.getEventname());
            pstmt.setString(2,u.getEventplace());
            pstmt.setString(3,u.getName());
            pstmt.setString(4,u.getId());
            pstmt.setString(5,u.getPhone());
            pstmt.setString(6,u.getDate());
            
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
    
        public ArrayList <event> showEvents(String ph)
	{
		ArrayList <event> cl = new ArrayList<>();
		
                String url = "jdbc:mysql://localhost:3306/project?useSSL=false";
		
                try
                    {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,"root","Sahil1597@");
			
			String query = "SELECT eventname,eventplace,name FROM event WHERE phone = ?";
			PreparedStatement pstmt = con.prepareStatement(query);
			
			pstmt.setString(1,ph);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())
			{
				event c = new event();
				
				c.setEventname(rs.getString(1));
				c.setEventplace(rs.getString(2));
				c.setName(rs.getString(3));
				
				cl.add(c);
			}
                    }
                    catch(Exception e)
                    {
                    System.out.println(e + "<br>");
                    }
        return cl;
	}
}
