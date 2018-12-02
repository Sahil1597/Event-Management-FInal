/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modal;
import java.sql.*;
import org.hibernate.cfg.*;
import org.hibernate.*;
/**
 *
 * @author Sahil
 */
public class UserDAO {
    String name;
    String ph;
//    public boolean validate(String fname,String password)
//    {
//        String url = "jdbc:mysql://localhost:3306/project?useSSL=false";
//        try
//        {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con = DriverManager.getConnection(url,"root","Sahil1597@");
//            String query = "SELECT * FROM user WHERE fname = ? AND password = ?";
//            PreparedStatement pstmt = con.prepareStatement(query);
//            pstmt.setString(1,fname);
//            pstmt.setString(2,password);
//            ResultSet rs = pstmt.executeQuery();
//            if(rs.next())
//            {
//                name = rs.getString(1);
//                ph = rs.getString(5);
//               return true; 
//            }   
//            {
//                return false;
//            }
//         }
//        catch(Exception e)
//        {
//            System.out.print(e);
//        }
//        return false;
//    }
//    
    public boolean save(User u)
    {
        String url = "jdbc:mysql://localhost:3306/project?useSSL=false";
         try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, "root", "Sahil1597@");
            String query = "INSERT INTO user () VALUES (?,?,?,?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1,u.getFname());
            pstmt.setString(2,u.getLname());
            pstmt.setString(3,u.getId());
            pstmt.setString(4,u.getPassword());
            pstmt.setString(5,u.getNumber());
            pstmt.setString(6,u.getAddress());
            
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
            System.out.println(e); 
        }
        return false;
        
    }
    
      public boolean validate(User uu)
        {
        User  u = null;
        try
        {
           Configuration cf = new Configuration();
           cf.configure("hibercfg/hibernate.cfg.xml");
           SessionFactory sf = cf.buildSessionFactory();
           Session s = sf.openSession();
           u = (User)s.get(User.class,uu.getFname());
            //System.out.println("checking if u == null : " + u == null + " chk");
            
            System.out.println("uu.fname = " + uu.getFname() + " uu.password = " + uu.getPassword());
            System.out.println("u.fname = " + u.getFname() + " u.password = " + u.getPassword());
           s.close();
           sf.close();
           name = u.getFname();
           ph = u.getNumber();
        }
        
        catch(Exception e)
        {
            System.out.println(e);
            e.printStackTrace();
        }
        
        if(u == null)
        {
            return false;
        }
        else if(u.getFname().equals(uu.getFname()) && u.getPassword().equals(uu.getPassword()))
            return true;
        else
            return false;   
    }
      
    public String getFname()
    {
        return name;
    }

    public String getPh()
    {
        return ph;
    }

    
}
