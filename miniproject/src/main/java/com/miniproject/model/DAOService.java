package com.miniproject.model;

import java.sql.ResultSet;

public interface DAOService {
public void connectDB();
public boolean verifyCredentials(String email,String password);
public void saveRegistration(String name, String city, String email, String mobile);
public ResultSet listAllRegs();
public void deleteRecords(String email);
public void updateRegistration(String email, String mobile);
}
