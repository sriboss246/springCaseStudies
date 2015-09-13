package com.wipro.servletsrc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginIntoServlet
 */
public class LoginIntoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginIntoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			com.wipro.entitybean.classes.Login_Bean_Class x = (com.wipro.entitybean.classes.Login_Bean_Class)request.getAttribute("LoginIntoServlet");
			
			com.wipro.databasesrc.User_Check_DAO x1 = new com.wipro.databasesrc.User_Check_DAO();
			if(x1.loginCheck(x)==1){
				HttpSession session=request.getSession();
				session.setAttribute("userid", x.getUsername());
				response.sendRedirect("WelcomeUser.html");
			}
			else if(x1.loginCheck(x)==2){
				response.sendRedirect("WelcomeAdmin.html");
			}
			else if(x1.loginCheck(x)==3){
				response.sendRedirect("WelcomeEO.html");
			}
			else{
				
				
				response.sendRedirect("UserCheck.html");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
