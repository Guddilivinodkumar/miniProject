package com.miniproject.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.miniproject.model.DAOService;
import com.miniproject.model.DAOServiceImpl;

@WebServlet("/register")
public class registrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
        public registrationController() {
        super();
    }

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			HttpSession session = request.getSession(false);
            if(session.getAttribute("email")!=null){
			RequestDispatcher rd= request.getRequestDispatcher("WEB-INF/views/create_registration.jsp");
            rd.forward(request, response);
            }
            else {
            	RequestDispatcher rd= request.getRequestDispatcher("first_jsp.jsp");
    	        rd.forward(request, response);
            }
		}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			HttpSession session = request.getSession(false);
            if(session.getAttribute("email")!=null){
			String name =  request.getParameter("name");
            String city =   request.getParameter("city");
            String email =  request.getParameter("email");
             String mobile = request.getParameter("mobile");
             DAOService ds = new DAOServiceImpl();
             ds.connectDB();
             ds.saveRegistration(name,city,email,mobile);
             request.setAttribute("record","0record saved successfully");
             RequestDispatcher rd= request.getRequestDispatcher("WEB-INF/views/create_registration.jsp");
             rd.include(request, response);
		}
            else {
            	RequestDispatcher rd= request.getRequestDispatcher("first_jsp.jsp");
    	        rd.forward(request, response);
            }

}
}
