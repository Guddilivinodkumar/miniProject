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

import com.miniproject.Model.DAOService;
import com.miniproject.Model.DAOServiceImpl;


@WebServlet("/delete")
public class DeleteRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
        public DeleteRegistration() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);   
		if(session.getAttribute("email")!=null) {
		      String email = request.getParameter("email");
              DAOService ds = new DAOServiceImpl();
              ds.connectDb();
              ds.deleteReg(email);
              ResultSet res = ds.ListRegistration();
              request.setAttribute("list", res);
              RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/List_registration.jsp");
              rd.forward(request, response);
	}
	else {
		request.setAttribute("again", "please login again");
		RequestDispatcher rd = request.getRequestDispatcher("first_jsp.jsp");
		rd.forward(request, response);
	}

             
	}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		}

}
