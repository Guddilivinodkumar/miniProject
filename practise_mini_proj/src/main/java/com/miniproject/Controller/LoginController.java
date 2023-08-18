package com.miniproject.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.miniproject.Model.DAOService;
import com.miniproject.Model.DAOServiceImpl;


@WebServlet("/Login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
        public LoginController() {
        super();

        }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			   String name=  request.getParameter("name");
               String password = request.getParameter("password");
               DAOService ds = new DAOServiceImpl();
               ds.connectDb();
               String verifyCredentials = ds.verifyCredentials(name, password);
               HttpSession session = request.getSession();
               if(verifyCredentials.equals("accepted")) {
            	   session.setAttribute("email", name);
            	   RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/create_registration.jsp");
            	   rd.forward(request, response);
               }
               else {
            	   request.setAttribute("msg", "userName/password is incorrect");
            	   RequestDispatcher rd = request.getRequestDispatcher("first_jsp.jsp");
            	   rd.include(request, response);
               }
		}

}
