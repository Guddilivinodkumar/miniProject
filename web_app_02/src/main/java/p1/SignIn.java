package p1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/web")
public class SignIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
        public SignIn() {
        super();
    }

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String email = request.getParameter("email");
		 String password =request.getParameter("pass");	
	    	System.out.println(email);
	    	System.out.println(password);
		 try { 
				Class.forName("com.mysql.cj.jdbc.Driver");
			    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration","root","Vinod654@");
			    Statement stmnt = con.createStatement();
			    ResultSet res = stmnt.executeQuery("select Password from loginform where Email='"+email+"'");
			    String str="";
			    while(res.next()) {
			    str = res.getString(1);
			    }
			    if(str.equals(password)) {
			    	System.out.println("welcome");
			    }
			    else
			    	System.out.println("your password is wrong! please enter correct password");
			    }
			    catch(Exception e) {
			    	
			    }
		}

}
