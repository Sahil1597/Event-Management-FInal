/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

/**
 *
 * @author Sahil
 */
public class User {
String fname;
String lname;
String id;
String password;
String number;
String address;

    public User()
    {
        
    }
    
   public User(String fname,String password)
    {
        this.fname = fname;
        this.password = password;
    }


    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }    
    @Override
    public boolean equals(Object o)
 {
     User u = (User)o;
     
     if(fname.equals(u.getFname()) && password.equals(u.getPassword()))
     return true;
     else
     return false;
 }
    
}
