package p2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@WebServlet("/signIn")
public class signIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
       public signIn() {
        super();
       
       }
       protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String name = request.getParameter("userName");
		    String pass = request.getParameter("pass");
		    System.out.println(name);
		    System.out.println(pass);
			try { 
				Class.forName("com.mysql.cj.jdbc.Driver");
			    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","Vinod654@");
			    Statement stmnt = con.createStatement();
			    ResultSet res = stmnt.executeQuery("select password from loginForm where Email='"+name+"'");
			    if((res.getString(1)).equals(pass)) {
			    	System.out.println("welcome");
			    }
			    else
			    	System.out.println("your password is wrong! please enter correct password");
			    }
			    catch(Exception e) {
			    	
			    }
		}

}
