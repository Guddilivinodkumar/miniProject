package com.miniproject.Controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.miniproject.model.DAOService;
import com.miniproject.model.DAOServiceImpl;


@WebServlet("/update")
public class updateaRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public updateaRegistrationController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("emailId");
		String mobile=request.getParameter("mobile");
		request.setAttribute("email", email);
		request.setAttribute("mobile", mobile);
		RequestDispatcher rd= request.getRequestDispatcher("WEB-INF/views/update_registration.jsp");
        rd.forward(request, response);


	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
        if(session.getAttribute("email")!=null){
		String email=request.getParameter("email");  
		String mobile=request.getParameter("mobile");
		DAOService ds= new DAOServiceImpl();
		ds.connectDB();
		ds.updateRegistration(email, mobile);
		ResultSet res = ds.listAllRegs();
	    request.setAttribute("list",res);
        RequestDispatcher rd= request.getRequestDispatcher("WEB-INF/views/search_registration.jsp");
        rd.forward(request, response);	
        }
        else {
        	RequestDispatcher rd= request.getRequestDispatcher("first_jsp.jsp");
	        rd.forward(request, response);
        }

}
}
