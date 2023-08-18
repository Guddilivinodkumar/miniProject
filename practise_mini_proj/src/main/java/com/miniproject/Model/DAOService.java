package com.miniproject.Model;

import java.sql.ResultSet;

public interface DAOService {
public void connectDb();
public String verifyCredentials(String name,String password);
public void createRegistration(String name, String city, String email, String mobile);
public ResultSet ListRegistration();
public void deleteReg(String email);
public void updateReg(String email, String mobile);
}
