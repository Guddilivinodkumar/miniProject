package com.miniproject.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAOServiceImpl implements DAOService {
	private Statement stmnt;
	private Connection con;
	@Override
	public void connectDB() {
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/proj_reg_db","root","Vinod654@");
             stmnt = con.createStatement();	
    	} catch (Exception e) {
			e.printStackTrace();
		}
    }
   @Override
    public boolean verifyCredentials(String email,String password) {
       try {
		ResultSet res = stmnt.executeQuery("select * from login where email='"+email+"'and password='"+password+"'");
	    	return res.next();
       } catch (SQLException e) {
		e.printStackTrace();
	}
     return false;
    }
@Override
public void saveRegistration(String name, String city, String email, String mobile) {

	try {
		  stmnt.executeUpdate("insert into registration values('"+name+"','"+city+"','"+email+"','"+mobile+"')");
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
@Override
public ResultSet listAllRegs() {
      try {
		ResultSet res = stmnt.executeQuery("select * from registration");
		return res;
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return null;
}
@Override
public void deleteRecords(String email) {
try {
	stmnt.executeUpdate("delete from registration where email='"+email+"'");
	
} catch (SQLException e) {
	e.printStackTrace();
}
}
@Override
public void updateRegistration(String email, String mobile) {
try {
	stmnt.executeUpdate("update registration set mobile='"+mobile+"' where email='"+email+"' ")	;
} catch (SQLException e) {
	e.printStackTrace();
}
}

}
