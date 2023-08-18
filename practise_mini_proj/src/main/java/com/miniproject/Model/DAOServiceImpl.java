package com.miniproject.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAOServiceImpl implements DAOService{
       private Connection con;
       private Statement stmnt;
	@Override
	public void connectDb() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/proj_reg_db","root","Vinod654@");
			 stmnt = con.createStatement();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public String verifyCredentials(String name, String password) {
		try {
			ResultSet res = stmnt.executeQuery("select * from login where email='"+name+"' and password = '"+password+"'");
		    while(res.next()) {
		    	return "accepted";		    
		    }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "Invalid";
	}

	@Override
	public void createRegistration(String name, String city, String email, String mobile) {
             try {
			stmnt.executeUpdate("insert into registration values('"+name+"','"+city+"','"+email+"','"+mobile+"')");
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}

	@Override
	public ResultSet ListRegistration() {
          try {
			ResultSet res = stmnt.executeQuery("select * from registration");
			return res;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public void deleteReg(String email) {
            try {
				stmnt.executeUpdate("delete from registration where email='"+email+"'");
			} catch (SQLException e) {
				e.printStackTrace();
			}		
	}

	@Override
	public void updateReg(String email, String mobile) {
            try {
				stmnt.executeUpdate("update registration set mobile='"+mobile+"' where email='"+email+"'");
			} catch (SQLException e) {
				e.printStackTrace();
			}	
	}

	

}
