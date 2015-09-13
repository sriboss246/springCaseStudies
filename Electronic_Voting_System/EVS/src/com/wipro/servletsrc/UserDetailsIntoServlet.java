package com.wipro.servletsrc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserDetailsIntoServlet
 */
public class UserDetailsIntoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserDetailsIntoServlet() {
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
			com.wipro.entitybean.classes.User_Details_bean_class x = (com.wipro.entitybean.classes.User_Details_bean_class)request.getAttribute("UserDetailsIntoServlet");
			
			com.wipro.databasesrc.User_Details_DAO x1 = new com.wipro.databasesrc.User_Details_DAO ();
			if(x1.addUserDetails(x)==1){
				out.write("Records inserted successfully");
			}
			else 
				out.write("Error in inserting records");
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	}


