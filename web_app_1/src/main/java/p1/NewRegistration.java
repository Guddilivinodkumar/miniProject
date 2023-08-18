package p1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet("/web")
public class NewRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public NewRegistration() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
              response.setContentType("text/html");
		      PrintWriter out = response.getWriter();
		      try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/registration","root","Vinod654@");
					Statement stmnt = con.createStatement();
					
					ResultSet res = stmnt.executeQuery("select * from registration");
					
					out.println("<table border='1'>");  
		              out.println("<tr>");   
					  out.println("<th>"); 
		                    out.println("name");               
		              out.println("</th>");               
		              out.println("<th>"); 
		                    out.println("city");               
		              out.println("</th>");
		              out.println("<th>"); 
		                    out.println("email");               
		              out.println("</th>"); 
		              out.println("</tr>"); 
		              while(res.next()) {
		            	  out.println("<tr>");   
						  out.println("<td>"); 
			                    out.println(res.getString(1));               
			              out.println("</td>");               
			              out.println("<td>"); 
			                    out.println(res.getString(2));               
			              out.println("</td>");
			              out.println("<td>"); 
			                    out.println(res.getString(3));               
			              out.println("</td>"); 
			              out.println("</tr>"); 
		              }
		              out.println("</table>");
					con.close();
				} catch (SQLException | ClassNotFoundException e) {
					e.printStackTrace();
				}
                             
	}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			//System.out.println("post");
			String name=request.getParameter("name");
			System.out.println(name);
			String city=request.getParameter("city");
			System.out.println(city);
			String email=request.getParameter("email");
			System.out.println(email);
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/registration","root","Vinod654@");
				Statement stmnt = con.createStatement();
				
				stmnt.executeUpdate("insert into registration values('"+name+"','"+city+"','"+email+"')");
				con.close();
			} catch (SQLException | ClassNotFoundException e) {
				e.printStackTrace();
			}
			 PrintWriter out = response.getWriter();
             out.println("the data has been stored in the database successfully2");

	}

}
