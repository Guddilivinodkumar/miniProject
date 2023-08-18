package registration_01;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.annotation.WebServlet;



@WebServlet("/new")
public class registration_01 extends javax.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;
       
        public registration_01() {
        super();
    }

		protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws IOException {
	}

		protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws IOException {
           String name=request.getParameter("userName");
           System.out.println(name);
           String url=request.getParameter("url");
           System.out.println(url);
           String gender=request.getParameter("gender");
           
               System.out.println(gender);
         
           String[] lang=request.getParameterValues("check");
           String checkBox="";
           for(String i:lang) {
        	   checkBox+=i+" ";
           }
           System.out.println(checkBox);
           String date=request.getParameter("date");
           System.out.println(date);
           try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/practise_01","root","Vinod654@");
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("insert into practise values('"+name+"','"+url+"','"+gender+"','"+checkBox+"','"+date+"')");
            //stmnt.executeUpdate("delete from practise where reg_date='date'");
			con.close();
           }
           catch(Exception e) {
        	   e.printStackTrace();
           }
		}

}
